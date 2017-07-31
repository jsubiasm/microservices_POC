package io.data.api;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import io.data.model.Persona;
import io.data.repo.PersonaRepository;
import io.swagger.api.PersonaApi;
import io.swagger.model.AddPersonaBody;
import io.swagger.model.InlineResponse200;
import io.swagger.model.UpdatePersonaBody;

/**
 * @author Empleado
 *
 */
@Component
public class PersonaApiControllerImpl implements PersonaApi
{

	@Autowired
	private PersonaRepository repository;

	/**
	 * 
	 */
	private final static Logger LOGGER = LoggerFactory.getLogger(PersonaApiControllerImpl.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * io.swagger.api.PersonaApi#addPersona(io.swagger.model.AddPersonaBody)
	 */
	@Override
	public ResponseEntity<Void> addPersona(AddPersonaBody addPersonaBody)
	{
		try
		{
			LOGGER.info("Insertando persona...");
			Persona persona = new Persona();
			persona.setNombre(addPersonaBody.getNombre());
			persona.setProfesion(addPersonaBody.getProfesion());
			repository.insert(persona);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		catch (Exception e)
		{
			LOGGER.error("Error insertando persona", e);
			return new ResponseEntity<Void>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		finally
		{
			LOGGER.info("Fin inserción persona.");
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see io.swagger.api.PersonaApi#deletePersona(java.lang.String)
	 */
	@Override
	public ResponseEntity<Void> deletePersona(String idPersona)
	{
		repository.delete(idPersona);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see io.swagger.api.PersonaApi#findAllPersonas()
	 */
	@Override
	public ResponseEntity<List<InlineResponse200>> findAllPersonas()
	{
		List<Persona> allPersonas = repository.findAll();
		List<InlineResponse200> respBody = new ArrayList<>();
		for (Persona persona : allPersonas)
		{
			InlineResponse200 respItem = new InlineResponse200();
			respItem.setId(persona.getId());
			respItem.setNombre(persona.getNombre());
			respItem.setProfesion(persona.getProfesion());
			respBody.add(respItem);
		}
		return new ResponseEntity<List<InlineResponse200>>(respBody, HttpStatus.OK);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see io.swagger.api.PersonaApi#getPersonaPorId(java.lang.String)
	 */
	@Override
	public ResponseEntity<InlineResponse200> getPersonaPorId(String idPersona)
	{
		Persona persona = repository.findById(idPersona);
		InlineResponse200 respBody = new InlineResponse200();
		respBody.setId(persona.getId());
		respBody.setNombre(persona.getNombre());
		respBody.setProfesion(persona.getProfesion());
		return new ResponseEntity<InlineResponse200>(respBody, HttpStatus.OK);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see io.swagger.api.PersonaApi#updatePersona(io.swagger.model.
	 * UpdatePersonaBody)
	 */
	@Override
	public ResponseEntity<Void> updatePersona(UpdatePersonaBody updatePersonaBody)
	{
		Persona persona = new Persona();
		persona.setId(updatePersonaBody.getId());
		persona.setNombre(updatePersonaBody.getNombre());
		persona.setProfesion(updatePersonaBody.getProfesion());
		repository.save(persona);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

}
