/**
 * NOTE: This class is auto generated by the swagger code generator program (2.2.3).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.AddPersonaBody;
import io.swagger.model.InlineResponse200;
import io.swagger.model.UpdatePersonaBody;

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
import javax.validation.Valid;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-07-31T12:03:01.289Z")

@Api(value = "persona", description = "the persona API")
public interface PersonaApi {

    @ApiOperation(value = "Añade una nueva persona", notes = "Añade una nueva persona", response = Void.class, tags={ "Personas", })
    @ApiResponses(value = { 
        @ApiResponse(code = 405, message = "Error de validación de datos", response = Void.class) })
    
    @RequestMapping(value = "/persona",
        produces = { "application/xml", "application/json" }, 
        consumes = { "application/json", "application/xml" },
        method = RequestMethod.POST)
    ResponseEntity<Void> addPersona(@ApiParam(value = "Datos de la persona" ,required=true )  @Valid @RequestBody AddPersonaBody addPersonaBody);


    @ApiOperation(value = "Elimina una persona", notes = "Elimina una persona", response = Void.class, tags={ "Personas", })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Identificador no válido", response = Void.class),
        @ApiResponse(code = 404, message = "Persona no encontrada", response = Void.class) })
    
    @RequestMapping(value = "/persona/{idPersona}",
        produces = { "application/xml", "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deletePersona(@ApiParam(value = "ID de la persona",required=true ) @PathVariable("idPersona") String idPersona);


    @ApiOperation(value = "Devuelve todas las personas", notes = "Devuelve todas las personas", response = InlineResponse200.class, responseContainer = "List", tags={ "Personas", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "operación correcta", response = InlineResponse200.class, responseContainer = "List") })
    
    @RequestMapping(value = "/persona/findAll",
        produces = { "application/xml", "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<InlineResponse200>> findAllPersonas();


    @ApiOperation(value = "Devuelve una persona por su ID", notes = "Devuelve una persona por su ID", response = InlineResponse200.class, tags={ "Personas", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "operacion correcta", response = InlineResponse200.class),
        @ApiResponse(code = 400, message = "Identificador no válido", response = Void.class),
        @ApiResponse(code = 404, message = "Persona no encontrada", response = Void.class) })
    
    @RequestMapping(value = "/persona/{idPersona}",
        produces = { "application/xml", "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<InlineResponse200> getPersonaPorId(@ApiParam(value = "ID de la persona",required=true ) @PathVariable("idPersona") String idPersona);


    @ApiOperation(value = "Modifica una persona ya existente", notes = "Modifica una persona ya existente", response = Void.class, tags={ "Personas", })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Identificador no válido", response = Void.class),
        @ApiResponse(code = 404, message = "Persona no encontrada", response = Void.class),
        @ApiResponse(code = 405, message = "Error de validación de datos", response = Void.class) })
    
    @RequestMapping(value = "/persona",
        produces = { "application/xml", "application/json" }, 
        consumes = { "application/json", "application/xml" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> updatePersona(@ApiParam(value = "Datos de la persona" ,required=true )  @Valid @RequestBody UpdatePersonaBody updatePersonaBody);

}
