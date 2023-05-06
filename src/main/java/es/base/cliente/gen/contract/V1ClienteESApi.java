package es.base.cliente.gen.contract;

import es.base.cliente.gen.type.ClienteType;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;


import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/v1/es/cliente")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-05-06T10:18:05.076088800-05:00[America/Bogota]")
public interface V1ClienteESApi {

    @POST
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    List<ClienteType> crearClienteType(@Valid ClienteType clienteType);

    @GET
    @Produces({ "application/json" })
    List<ClienteType> obtenerCliente();
}
