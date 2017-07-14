package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
/**
 * Saludo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-07-14T09:18:45.553Z")

public class Saludo   {
  @JsonProperty("palabra01")
  private String palabra01 = null;

  @JsonProperty("palabra02")
  private String palabra02 = null;

  public Saludo palabra01(String palabra01) {
    this.palabra01 = palabra01;
    return this;
  }

   /**
   * Get palabra01
   * @return palabra01
  **/
  @ApiModelProperty(example = "Hola", required = true, value = "")
  @NotNull
  public String getPalabra01() {
    return palabra01;
  }

  public void setPalabra01(String palabra01) {
    this.palabra01 = palabra01;
  }

  public Saludo palabra02(String palabra02) {
    this.palabra02 = palabra02;
    return this;
  }

   /**
   * Get palabra02
   * @return palabra02
  **/
  @ApiModelProperty(example = "Mundo", required = true, value = "")
  @NotNull
  public String getPalabra02() {
    return palabra02;
  }

  public void setPalabra02(String palabra02) {
    this.palabra02 = palabra02;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Saludo saludo = (Saludo) o;
    return Objects.equals(this.palabra01, saludo.palabra01) &&
        Objects.equals(this.palabra02, saludo.palabra02);
  }

  @Override
  public int hashCode() {
    return Objects.hash(palabra01, palabra02);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Saludo {\n");
    
    sb.append("    palabra01: ").append(toIndentedString(palabra01)).append("\n");
    sb.append("    palabra02: ").append(toIndentedString(palabra02)).append("\n");
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

