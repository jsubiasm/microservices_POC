package io.swagger.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.model.InlineResponse200;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-07-14T09:18:45.553Z")

@Api(value = "holamundo2", description = "the holamundo2 API")
public interface Holamundo2Api
{
	@CrossOrigin
	@ApiOperation(value = "Devuelve un Hola Mundo", notes = "endpoint que devuelve un Hola Mundo", response = InlineResponse200.class, tags = {})
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Response OK", response = InlineResponse200.class), @ApiResponse(code = 200, message = "Unexpected error", response = InlineResponse200.class) })
	@RequestMapping(value = "/holamundo2", produces = { "application/json" }, consumes = { "application/json" }, method = RequestMethod.GET)
	ResponseEntity<InlineResponse200> holamundo2Get();

}
