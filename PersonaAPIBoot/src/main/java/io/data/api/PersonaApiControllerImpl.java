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
		LOGGER.info("Insertando persona [" + addPersonaBody.getNombre() + "] [" + addPersonaBody.getProfesion() + "]");
		ResponseEntity<Void> response = null;
		try
		{
			Persona persona = new Persona();
			persona.setNombre(addPersonaBody.getNombre());
			persona.setProfesion(addPersonaBody.getProfesion());
			repository.insert(persona);
			response = new ResponseEntity<Void>(HttpStatus.OK);
			LOGGER.info("Persona insertada");
		}
		catch (Exception e)
		{
			LOGGER.error("Error insertando persona", e);
			response = new ResponseEntity<Void>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		LOGGER.info("Fin inserción persona");
		return response;
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
		LOGGER.info("Modificando persona [" + updatePersonaBody.getId() + "] [" + updatePersonaBody.getNombre() + "] [" + updatePersonaBody.getProfesion() + "]");
		ResponseEntity<Void> response = null;
		try
		{
			Persona persona = new Persona();
			persona.setId(updatePersonaBody.getId());
			persona.setNombre(updatePersonaBody.getNombre());
			persona.setProfesion(updatePersonaBody.getProfesion());
			repository.save(persona);
			response = new ResponseEntity<Void>(HttpStatus.OK);
			LOGGER.info("Persona modificada");
		}
		catch (Exception e)
		{
			LOGGER.error("Error modificando persona", e);
			response = new ResponseEntity<Void>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		LOGGER.info("Fin modificación persona");
		return response;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see io.swagger.api.PersonaApi#deletePersona(java.lang.String)
	 */
	@Override
	public ResponseEntity<Void> deletePersona(String idPersona)
	{
		LOGGER.info("Borrando persona [" + idPersona + "]");
		ResponseEntity<Void> response = null;
		try
		{
			repository.delete(idPersona);
			response = new ResponseEntity<Void>(HttpStatus.OK);
			LOGGER.info("Persona borrada");
		}
		catch (Exception e)
		{
			LOGGER.info("Error borrando persona");
			response = new ResponseEntity<Void>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		LOGGER.info("Fin borrado persona");
		return response;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see io.swagger.api.PersonaApi#findAllPersonas()
	 */
	@Override
	public ResponseEntity<List<InlineResponse200>> findAllPersonas()
	{
		LOGGER.info("Buscando todas las personas");
		ResponseEntity<List<InlineResponse200>> response = null;
		try
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
			response = new ResponseEntity<List<InlineResponse200>>(respBody, HttpStatus.OK);
			LOGGER.info("Personas encontradas [" + respBody.size() + "]");
		}
		catch (Exception e)
		{
			LOGGER.info("Error buscando personas");
			response = new ResponseEntity<List<InlineResponse200>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		LOGGER.info("Fin buscar todas las personas");
		return response;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see io.swagger.api.PersonaApi#getPersonaPorId(java.lang.String)
	 */
	@Override
	public ResponseEntity<InlineResponse200> getPersonaPorId(String idPersona)
	{
		LOGGER.info("Buscando persona por id [" + idPersona + "]");
		ResponseEntity<InlineResponse200> response = null;
		try
		{
			Persona persona = repository.findById(idPersona);
			InlineResponse200 respBody = new InlineResponse200();
			respBody.setId(persona.getId());
			respBody.setNombre(persona.getNombre());
			respBody.setProfesion(persona.getProfesion());
			response = new ResponseEntity<InlineResponse200>(respBody, HttpStatus.OK);
			LOGGER.info("Persona encontrada");
		}
		catch (Exception e)
		{
			LOGGER.info("Error buscando persona");
			response = new ResponseEntity<InlineResponse200>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		LOGGER.info("Fin buscar persona por id");
		return response;
	}

}
