package es.base.cliente.utils;

import es.base.cliente.gen.type.ClienteType;
import es.base.cliente.gen.type.TipoDocumentoEnum;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.core.Response;

import static es.base.cliente.constants.Constantes.TELEFONO_PRINCIPAL;


@ApplicationScoped
public class ClienteValidator {

    public Response verificarTipoDocYNumDoc(TipoDocumentoEnum tipoDocumento, String numeroDocumento)
            throws ApplicationException {

        if (tipoDocumento == null) {
            throw new ApplicationException("El tipo de documento es obligatorio");
        }
        if (numeroDocumento == null) {
            throw new ApplicationException("El numero de documento es obligatorio");
        }
        return Response.ok().build();

    }

    public Response verificarDatosCliente(ClienteType clienteType)
            throws ApplicationException {

        if (clienteType.getNumeroCelular() == null) {
            throw new ApplicationException(TELEFONO_PRINCIPAL);
        }
        return Response.ok().build();
    }
}
