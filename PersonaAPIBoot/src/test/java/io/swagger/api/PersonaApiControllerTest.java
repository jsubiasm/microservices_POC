package io.swagger.api;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import io.swagger.model.AddPersonaBody;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonaApiControllerTest
{

	@Autowired
	private PersonaApiController api;

	@Test
	public void addPersona()
	{
		AddPersonaBody reqBody = new AddPersonaBody();
		reqBody.setNombre("Julio");
		reqBody.setProfesion("Fontanero");
		ResponseEntity<Void> response = api.addPersona(reqBody);
		assertEquals(200, response.getStatusCodeValue());
	}

	@Test
	public void deletePersona()
	{
		assertTrue(true);
	}

	@Test
	public void findAllPersonas()
	{
		assertTrue(true);
	}

	@Test
	public void getPersonaPorId()
	{
		assertTrue(true);
	}

	@Test
	public void updatePersona()
	{
		assertTrue(true);
	}
}
