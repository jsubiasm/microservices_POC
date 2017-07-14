package io.swagger.api;

import io.swagger.model.InlineResponse200;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-07-14T09:18:45.553Z")

@Api(value = "holamundo2", description = "the holamundo2 API")
public interface Holamundo2Api {

    @ApiOperation(value = "Devuelve un Hola Mundo", notes = "endpoint que devuelve un Hola Mundo", response = InlineResponse200.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Response OK", response = InlineResponse200.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = InlineResponse200.class) })
    @RequestMapping(value = "/holamundo2",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<InlineResponse200> holamundo2Get();

}
