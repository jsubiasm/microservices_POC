package io.swagger.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-07-14T09:18:45.553Z")

@Api(value = "holamundo", description = "the holamundo API")
public interface HolamundoApi
{
	@CrossOrigin
	@ApiOperation(value = "", notes = "Devuelve un Hola Mundo", response = String.class, tags = {})
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Response OK", response = String.class) })
	@RequestMapping(value = "/holamundo", method = RequestMethod.GET)
	ResponseEntity<String> holamundoGet();

}
