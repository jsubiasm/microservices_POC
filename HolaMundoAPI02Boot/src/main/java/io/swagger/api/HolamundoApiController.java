package io.swagger.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import io.swagger.model.InlineResponse200;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-07-17T11:08:28.154Z")

@Controller
public class HolamundoApiController implements HolamundoApi
{

	public ResponseEntity<InlineResponse200> holamundoGet()
	{
		InlineResponse200 respBody = new InlineResponse200();
		respBody.setPalabra01("Hola");
		respBody.setPalabra02("Mundo");
		return new ResponseEntity<InlineResponse200>(respBody, HttpStatus.OK);
	}

}
