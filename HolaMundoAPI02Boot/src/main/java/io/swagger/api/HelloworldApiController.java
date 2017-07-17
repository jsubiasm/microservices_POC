package io.swagger.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-07-17T11:08:28.154Z")

@Controller
public class HelloworldApiController implements HelloworldApi
{

	public ResponseEntity<String> helloworldGet()
	{
		String respBody = "Hello World";
		return new ResponseEntity<String>(respBody, HttpStatus.OK);
	}

}
