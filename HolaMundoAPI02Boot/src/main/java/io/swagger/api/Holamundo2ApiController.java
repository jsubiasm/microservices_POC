package io.swagger.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import io.swagger.model.InlineResponse200;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-07-14T09:18:45.553Z")

@Controller
public class Holamundo2ApiController implements Holamundo2Api
{

	public ResponseEntity<InlineResponse200> holamundo2Get()
	{
		InlineResponse200 response = new InlineResponse200();
		response.setPalabra01("Hola");
		response.setPalabra02("Mundo");
		return new ResponseEntity<InlineResponse200>(HttpStatus.OK);
	}

}
