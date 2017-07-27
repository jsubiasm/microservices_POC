package io.swagger.api;

import io.swagger.model.AddPersonaBody;
import io.swagger.model.InlineResponse200;
import io.swagger.model.UpdatePersonaBody;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-07-27T10:17:03.704Z")

@Controller
public class PersonaApiController implements PersonaApi {



    public ResponseEntity<Void> addPersona(@ApiParam(value = "Datos de la persona" ,required=true )  @Valid @RequestBody AddPersonaBody addPersonaBody) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> deletePersona(@ApiParam(value = "ID de la persona",required=true ) @PathVariable("idPersona") Long idPersona) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<List<InlineResponse200>> findAllPersonas() {
        // do some magic!
        return new ResponseEntity<List<InlineResponse200>>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse200> getPersonaPorId(@ApiParam(value = "ID de la persona",required=true ) @PathVariable("idPersona") Long idPersona) {
        // do some magic!
        return new ResponseEntity<InlineResponse200>(HttpStatus.OK);
    }

    public ResponseEntity<Void> updatePersona(@ApiParam(value = "Datos de la persona" ,required=true )  @Valid @RequestBody UpdatePersonaBody updatePersonaBody) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
