package io.swagger.api;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import io.swagger.model.AddPersonaBody;
import io.swagger.model.InlineResponse200;
import io.swagger.model.UpdatePersonaBody;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonaApiControllerTest
{

	@Autowired
	private PersonaApiController api;

	/**
	 * 
	 */
	private final static Logger LOGGER = LoggerFactory.getLogger(PersonaApiControllerTest.class);

	@Test
	public void fullTest()
	{
		try
		{
			String nombre1 = "Julio";
			String nombre2 = "Antonio";
			String profesion1 = "Fontanero";
			String profesion2 = "Electricista";

			ResponseEntity<List<InlineResponse200>> response1 = api.findAllPersonas();
			LOGGER.info("Tamaño inicial lista [" + response1.getBody().size() + "]");
			assertEquals(200, response1.getStatusCodeValue());

			AddPersonaBody addPersonaBody = new AddPersonaBody();
			addPersonaBody.setNombre(nombre1);
			addPersonaBody.setProfesion(profesion1);
			ResponseEntity<InlineResponse200> response2 = api.addPersona(addPersonaBody);
			LOGGER.info("Persona insertada [" + nombre1 + "] [" + profesion1 + "]");
			assertEquals(200, response2.getStatusCodeValue());
			assertNotNull(response2.getBody().getId());

			String idPersona = response2.getBody().getId();
			LOGGER.info("Recuperado identificador de persona [" + idPersona + "]");
			assertNotNull(idPersona);

			UpdatePersonaBody updatePersonaBody = new UpdatePersonaBody();
			updatePersonaBody.setId(idPersona);
			updatePersonaBody.setNombre(nombre2);
			updatePersonaBody.setProfesion(profesion2);
			ResponseEntity<InlineResponse200> response4 = api.updatePersona(updatePersonaBody);
			LOGGER.info("Persona modificada [" + idPersona + "] [" + nombre2 + "] [" + profesion2 + "]");
			assertEquals(200, response4.getStatusCodeValue());
			assertNotNull(response4.getBody().getId());

			ResponseEntity<InlineResponse200> response5 = api.getPersonaPorId(idPersona);
			LOGGER.info("Persona encontrada [" + response5.getBody().getId() + "] [" + response5.getBody().getNombre() + "] [" + response5.getBody().getProfesion() + "]");
			assertEquals(200, response5.getStatusCodeValue());
			assertEquals(idPersona, response5.getBody().getId());
			assertEquals(nombre2, response5.getBody().getNombre());
			assertEquals(profesion2, response5.getBody().getProfesion());

			ResponseEntity<InlineResponse200> response6 = api.deletePersona(idPersona);
			LOGGER.info("Persona borrada [" + idPersona + "]");
			assertEquals(200, response6.getStatusCodeValue());
			assertNotNull(response6.getBody().getId());

			ResponseEntity<List<InlineResponse200>> response7 = api.findAllPersonas();
			LOGGER.info("Tamaño lista [" + response7.getBody().size() + "]");
			assertEquals(200, response7.getStatusCodeValue());
			assertEquals(response1.getBody().size(), response7.getBody().size());
		}
		catch (Exception e)
		{
			LOGGER.error("Error ejecutando test", e);
		}
	}

}
