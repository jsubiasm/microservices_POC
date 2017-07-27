package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Persona
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-07-27T10:17:03.704Z")

public class Persona   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("nombre")
  private String nombre = null;

  @JsonProperty("profesion")
  private String profesion = null;

  public Persona id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Persona nombre(String nombre) {
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

  public Persona profesion(String profesion) {
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
    Persona persona = (Persona) o;
    return Objects.equals(this.id, persona.id) &&
        Objects.equals(this.nombre, persona.nombre) &&
        Objects.equals(this.profesion, persona.profesion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nombre, profesion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Persona {\n");
    
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

