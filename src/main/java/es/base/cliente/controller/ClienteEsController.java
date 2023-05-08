package es.base.cliente.controller;

import es.base.cliente.dao.entity.ClienteEntity;
import es.base.cliente.gen.contract.V1ClienteESApi;
import es.base.cliente.gen.type.ClienteType;
import es.base.cliente.services.impl.ClienteServiceImpl;
import es.base.cliente.utils.ApplicationException;
import es.base.cliente.utils.ClienteMapper;
import jakarta.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class ClienteEsController implements V1ClienteESApi {

    private static final Logger LOG = LoggerFactory.getLogger(ClienteEsController.class);

    @Inject
    ClienteServiceImpl clienteService;

    @Inject
    ClienteMapper clienteMapper;

    @Override
    public List<ClienteType> crearClienteType(ClienteType clienteType) {

        LOG.info("Inicia crearCliente en ClienteEsController");
        try {
            ClienteEntity clienteEntity = clienteMapper.toCliente(clienteType);
            ClienteType createdType = clienteService.crearCliente(clienteEntity);

            LOG.info("Termina crear Cliente en ClienteEsController");
            return List.of(createdType);

        } catch (ApplicationException e) {

            throw new ApplicationException("ERROR_SERVICIO: " + e.getMessage() + " en ClienteEsController");

        }
    }

    @Override
    public List<ClienteType> obtenerCliente() {

        LOG.info("Inicia obtener Clientes en ClienteEsController");
        try {
            LOG.info("Termina obtener Clientes en ClienteEsController");
            return clienteService.obtenerClientes();

        } catch (ApplicationException e) {

            throw new ApplicationException("ERROR_SERVICIO " + e.getMessage() + " en ClienteEsController");
        }
    }
}
