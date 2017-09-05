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
	public ResponseEntity<InlineResponse200> addPersona(AddPersonaBody addPersonaBody)
	{
		LOGGER.info("Insertando persona [" + addPersonaBody.getNombre() + "] [" + addPersonaBody.getProfesion() + "]");
		ResponseEntity<InlineResponse200> response = null;
		try
		{
			Persona persona = new Persona();
			persona.setNombre(addPersonaBody.getNombre());
			persona.setProfesion(addPersonaBody.getProfesion());
			persona = repository.insert(persona);
			response = new ResponseEntity<InlineResponse200>(getResponseItemFromPersona(persona), HttpStatus.OK);
			LOGGER.info("Persona insertada");
		}
		catch (Exception e)
		{
			LOGGER.error("Error insertando persona", e);
			response = new ResponseEntity<InlineResponse200>(HttpStatus.INTERNAL_SERVER_ERROR);
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
	public ResponseEntity<InlineResponse200> updatePersona(UpdatePersonaBody updatePersonaBody)
	{
		LOGGER.info("Modificando persona [" + updatePersonaBody.getId() + "] [" + updatePersonaBody.getNombre() + "] [" + updatePersonaBody.getProfesion() + "]");
		ResponseEntity<InlineResponse200> response = null;
		try
		{
			if (updatePersonaBody.getId() == null || updatePersonaBody.getId().isEmpty())
			{
				response = new ResponseEntity<InlineResponse200>(HttpStatus.BAD_REQUEST);
			}
			else if (repository.findById(updatePersonaBody.getId()) == null)
			{
				response = new ResponseEntity<InlineResponse200>(HttpStatus.NOT_FOUND);
			}
			else
			{
				Persona persona = new Persona();
				persona.setId(updatePersonaBody.getId());
				persona.setNombre(updatePersonaBody.getNombre());
				persona.setProfesion(updatePersonaBody.getProfesion());
				persona = repository.save(persona);
				response = new ResponseEntity<InlineResponse200>(getResponseItemFromPersona(persona), HttpStatus.OK);
				LOGGER.info("Persona modificada");
			}
		}
		catch (Exception e)
		{
			LOGGER.error("Error modificando persona", e);
			response = new ResponseEntity<InlineResponse200>(HttpStatus.INTERNAL_SERVER_ERROR);
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
	public ResponseEntity<InlineResponse200> deletePersona(String idPersona)
	{
		LOGGER.info("Borrando persona [" + idPersona + "]");
		ResponseEntity<InlineResponse200> response = null;
		try
		{
			if (idPersona == null || idPersona.isEmpty())
			{
				response = new ResponseEntity<InlineResponse200>(HttpStatus.BAD_REQUEST);
			}
			else if (repository.findById(idPersona) == null)
			{
				response = new ResponseEntity<InlineResponse200>(HttpStatus.NOT_FOUND);
			}
			else
			{
				repository.delete(idPersona);
				InlineResponse200 respBody = new InlineResponse200();
				respBody.setId(idPersona);
				response = new ResponseEntity<InlineResponse200>(respBody, HttpStatus.OK);
				LOGGER.info("Persona borrada");
			}
		}
		catch (Exception e)
		{
			LOGGER.info("Error borrando persona");
			response = new ResponseEntity<InlineResponse200>(HttpStatus.INTERNAL_SERVER_ERROR);
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
				respBody.add(getResponseItemFromPersona(persona));
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
			if (idPersona == null || idPersona.isEmpty())
			{
				response = new ResponseEntity<InlineResponse200>(HttpStatus.BAD_REQUEST);
			}
			else if (repository.findById(idPersona) == null)
			{
				response = new ResponseEntity<InlineResponse200>(HttpStatus.NOT_FOUND);
			}
			else
			{
				Persona persona = repository.findById(idPersona);
				response = new ResponseEntity<InlineResponse200>(getResponseItemFromPersona(persona), HttpStatus.OK);
				LOGGER.info("Persona encontrada");
			}
		}
		catch (Exception e)
		{
			LOGGER.info("Error buscando persona");
			response = new ResponseEntity<InlineResponse200>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		LOGGER.info("Fin buscar persona por id");
		return response;
	}

	/**
	 * @param persona
	 * @return
	 */
	private InlineResponse200 getResponseItemFromPersona(Persona persona)
	{
		InlineResponse200 responseItem = new InlineResponse200();
		responseItem.setId(persona.getId());
		responseItem.setNombre(persona.getNombre());
		responseItem.setProfesion(persona.getProfesion());
		return responseItem;
	}

}
