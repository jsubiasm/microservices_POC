package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdatePersonaBody
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-08-04T09:58:29.605Z")

public class UpdatePersonaBody   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("nombre")
  private String nombre = null;

  @JsonProperty("profesion")
  private String profesion = null;

  public UpdatePersonaBody id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "a1b2", value = "")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public UpdatePersonaBody nombre(String nombre) {
    this.nombre = nombre;
    return this;
  }

   /**
   * Get nombre
   * @return nombre
  **/
  @ApiModelProperty(example = "Julio", required = true, value = "")
  @NotNull


  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public UpdatePersonaBody profesion(String profesion) {
    this.profesion = profesion;
    return this;
  }

   /**
   * Get profesion
   * @return profesion
  **/
  @ApiModelProperty(example = "Fontanero", required = true, value = "")
  @NotNull


  public String getProfesion() {
    return profesion;
  }

  public void setProfesion(String profesion) {
    this.profesion = profesion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatePersonaBody updatePersonaBody = (UpdatePersonaBody) o;
    return Objects.equals(this.id, updatePersonaBody.id) &&
        Objects.equals(this.nombre, updatePersonaBody.nombre) &&
        Objects.equals(this.profesion, updatePersonaBody.profesion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nombre, profesion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePersonaBody {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nombre: ").append(toIndentedString(nombre)).append("\n");
    sb.append("    profesion: ").append(toIndentedString(profesion)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

