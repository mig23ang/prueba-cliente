package es.base.cliente.gen.type;

import es.base.cliente.gen.type.TipoDocumentoEnum;
import es.base.cliente.gen.type.TipoPersonaEnum;
import java.util.Date;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("ClienteType")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-05-08T15:00:52.764615900-05:00[America/Bogota]")
public class ClienteType   {
  private @Valid Long id;
  private @Valid Integer numeroCliente;
  private @Valid TipoPersonaEnum tipoPersona;
  private @Valid TipoDocumentoEnum tipoDocumento;
  private @Valid Integer numeroDocumento;
  private @Valid Date fechaExpedicionDocumento;
  private @Valid String primerNombre;
  private @Valid Integer numeroCelular;
  private @Valid String segundoNombre;
  private @Valid String primerApellido;
  private @Valid String segundoApellido;
  private @Valid String correoElectronico;

  /**
   **/
  public ClienteType id(Long id) {
    this.id = id;
    return this;
  }

  
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(Long id) {
    this.id = id;
  }

  /**
   **/
  public ClienteType numeroCliente(Integer numeroCliente) {
    this.numeroCliente = numeroCliente;
    return this;
  }

  
  @JsonProperty("numeroCliente")
  public Integer getNumeroCliente() {
    return numeroCliente;
  }

  @JsonProperty("numeroCliente")
  public void setNumeroCliente(Integer numeroCliente) {
    this.numeroCliente = numeroCliente;
  }

  /**
   **/
  public ClienteType tipoPersona(TipoPersonaEnum tipoPersona) {
    this.tipoPersona = tipoPersona;
    return this;
  }

  
  @JsonProperty("tipoPersona")
  public TipoPersonaEnum getTipoPersona() {
    return tipoPersona;
  }

  @JsonProperty("tipoPersona")
  public void setTipoPersona(TipoPersonaEnum tipoPersona) {
    this.tipoPersona = tipoPersona;
  }

  /**
   **/
  public ClienteType tipoDocumento(TipoDocumentoEnum tipoDocumento) {
    this.tipoDocumento = tipoDocumento;
    return this;
  }

  
  @JsonProperty("tipoDocumento")
  public TipoDocumentoEnum getTipoDocumento() {
    return tipoDocumento;
  }

  @JsonProperty("tipoDocumento")
  public void setTipoDocumento(TipoDocumentoEnum tipoDocumento) {
    this.tipoDocumento = tipoDocumento;
  }

  /**
   **/
  public ClienteType numeroDocumento(Integer numeroDocumento) {
    this.numeroDocumento = numeroDocumento;
    return this;
  }

  
  @JsonProperty("numeroDocumento")
  public Integer getNumeroDocumento() {
    return numeroDocumento;
  }

  @JsonProperty("numeroDocumento")
  public void setNumeroDocumento(Integer numeroDocumento) {
    this.numeroDocumento = numeroDocumento;
  }

  /**
   **/
  public ClienteType fechaExpedicionDocumento(Date fechaExpedicionDocumento) {
    this.fechaExpedicionDocumento = fechaExpedicionDocumento;
    return this;
  }

  
  @JsonProperty("fechaExpedicionDocumento")
  public Date getFechaExpedicionDocumento() {
    return fechaExpedicionDocumento;
  }

  @JsonProperty("fechaExpedicionDocumento")
  public void setFechaExpedicionDocumento(Date fechaExpedicionDocumento) {
    this.fechaExpedicionDocumento = fechaExpedicionDocumento;
  }

  /**
   **/
  public ClienteType primerNombre(String primerNombre) {
    this.primerNombre = primerNombre;
    return this;
  }

  
  @JsonProperty("primerNombre")
  public String getPrimerNombre() {
    return primerNombre;
  }

  @JsonProperty("primerNombre")
  public void setPrimerNombre(String primerNombre) {
    this.primerNombre = primerNombre;
  }

  /**
   **/
  public ClienteType numeroCelular(Integer numeroCelular) {
    this.numeroCelular = numeroCelular;
    return this;
  }

  
  @JsonProperty("numeroCelular")
  public Integer getNumeroCelular() {
    return numeroCelular;
  }

  @JsonProperty("numeroCelular")
  public void setNumeroCelular(Integer numeroCelular) {
    this.numeroCelular = numeroCelular;
  }

  /**
   **/
  public ClienteType segundoNombre(String segundoNombre) {
    this.segundoNombre = segundoNombre;
    return this;
  }

  
  @JsonProperty("segundoNombre")
  public String getSegundoNombre() {
    return segundoNombre;
  }

  @JsonProperty("segundoNombre")
  public void setSegundoNombre(String segundoNombre) {
    this.segundoNombre = segundoNombre;
  }

  /**
   **/
  public ClienteType primerApellido(String primerApellido) {
    this.primerApellido = primerApellido;
    return this;
  }

  
  @JsonProperty("primerApellido")
  public String getPrimerApellido() {
    return primerApellido;
  }

  @JsonProperty("primerApellido")
  public void setPrimerApellido(String primerApellido) {
    this.primerApellido = primerApellido;
  }

  /**
   **/
  public ClienteType segundoApellido(String segundoApellido) {
    this.segundoApellido = segundoApellido;
    return this;
  }

  
  @JsonProperty("segundoApellido")
  public String getSegundoApellido() {
    return segundoApellido;
  }

  @JsonProperty("segundoApellido")
  public void setSegundoApellido(String segundoApellido) {
    this.segundoApellido = segundoApellido;
  }

  /**
   **/
  public ClienteType correoElectronico(String correoElectronico) {
    this.correoElectronico = correoElectronico;
    return this;
  }

  
  @JsonProperty("correoElectronico")
  public String getCorreoElectronico() {
    return correoElectronico;
  }

  @JsonProperty("correoElectronico")
  public void setCorreoElectronico(String correoElectronico) {
    this.correoElectronico = correoElectronico;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClienteType clienteType = (ClienteType) o;
    return Objects.equals(this.id, clienteType.id) &&
        Objects.equals(this.numeroCliente, clienteType.numeroCliente) &&
        Objects.equals(this.tipoPersona, clienteType.tipoPersona) &&
        Objects.equals(this.tipoDocumento, clienteType.tipoDocumento) &&
        Objects.equals(this.numeroDocumento, clienteType.numeroDocumento) &&
        Objects.equals(this.fechaExpedicionDocumento, clienteType.fechaExpedicionDocumento) &&
        Objects.equals(this.primerNombre, clienteType.primerNombre) &&
        Objects.equals(this.numeroCelular, clienteType.numeroCelular) &&
        Objects.equals(this.segundoNombre, clienteType.segundoNombre) &&
        Objects.equals(this.primerApellido, clienteType.primerApellido) &&
        Objects.equals(this.segundoApellido, clienteType.segundoApellido) &&
        Objects.equals(this.correoElectronico, clienteType.correoElectronico);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, numeroCliente, tipoPersona, tipoDocumento, numeroDocumento, fechaExpedicionDocumento, primerNombre, numeroCelular, segundoNombre, primerApellido, segundoApellido, correoElectronico);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClienteType {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    numeroCliente: ").append(toIndentedString(numeroCliente)).append("\n");
    sb.append("    tipoPersona: ").append(toIndentedString(tipoPersona)).append("\n");
    sb.append("    tipoDocumento: ").append(toIndentedString(tipoDocumento)).append("\n");
    sb.append("    numeroDocumento: ").append(toIndentedString(numeroDocumento)).append("\n");
    sb.append("    fechaExpedicionDocumento: ").append(toIndentedString(fechaExpedicionDocumento)).append("\n");
    sb.append("    primerNombre: ").append(toIndentedString(primerNombre)).append("\n");
    sb.append("    numeroCelular: ").append(toIndentedString(numeroCelular)).append("\n");
    sb.append("    segundoNombre: ").append(toIndentedString(segundoNombre)).append("\n");
    sb.append("    primerApellido: ").append(toIndentedString(primerApellido)).append("\n");
    sb.append("    segundoApellido: ").append(toIndentedString(segundoApellido)).append("\n");
    sb.append("    correoElectronico: ").append(toIndentedString(correoElectronico)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

