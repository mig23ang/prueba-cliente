package es.base.cliente.utils;

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ApplicationExceptionHandler implements ExceptionMapper<ApplicationException> {

    private static final Logger LOG = LoggerFactory.getLogger(ApplicationExceptionHandler.class);

    @Override
    public Response toResponse(ApplicationException e) {
        LOG.error(e.getMessage());
        return Response.status(Response.Status.BAD_REQUEST).entity(e.getMessage()).build();
    }
}
