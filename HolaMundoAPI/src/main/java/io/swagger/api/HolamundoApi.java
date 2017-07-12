package io.swagger.api;


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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-07-12T12:11:32.433Z")

@Api(value = "holamundo", description = "the holamundo API")
public interface HolamundoApi {

    @ApiOperation(value = "", notes = "Devuelve un Hola Mundo !!!", response = String.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Response OK", response = String.class) })
    @RequestMapping(value = "/holamundo",
        method = RequestMethod.GET)
    ResponseEntity<String> holamundoGet();

}
