package io.swagger.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-07-14T09:18:45.553Z")

@Controller
public class HolamundoApiController implements HolamundoApi
{

	public ResponseEntity<String> holamundoGet()
	{
		return new ResponseEntity<String>("Hello World", HttpStatus.OK);
	}

}
