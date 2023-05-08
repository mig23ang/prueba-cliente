package es.base.cliente.gen.contract;

import es.base.cliente.gen.type.ClienteType;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;



import java.io.InputStream;
import java.util.Map;
import java.util.List;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

@Path("/v1/es/cliente")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-05-08T10:25:46.717824800-05:00[America/Bogota]")
public interface V1ClienteESApi {

    @POST
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    List<ClienteType> crearClienteType(@Valid ClienteType clienteType);

    @GET
    @Produces({ "application/json" })
    List<ClienteType> obtenerCliente();
}
