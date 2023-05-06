package es.base.cliente.controller;

import es.base.cliente.dao.entity.ClienteEntity;
import es.base.cliente.gen.contract.V1ClienteESApi;
import es.base.cliente.gen.type.ClienteType;
import es.base.cliente.services.impl.ClienteServiceImpl;
import es.base.cliente.utils.ClienteMapper;
import jakarta.enterprise.inject.Default;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

import javax.ws.rs.Path;
import java.util.List;


public class ClienteEsController implements V1ClienteESApi {

    @Default
    @Inject
    ClienteServiceImpl clienteService;

    @Inject
    ClienteMapper clienteMapper;

    @Override
    public List<ClienteType> crearClienteType(ClienteType clienteType) {
        try {
            ClienteEntity clienteEntity = clienteMapper.toCliente(clienteType);
            ClienteType createdType = clienteService.crearCliente(clienteEntity);
            return List.of(createdType);
        } catch (Exception e) {
            throw new RuntimeException("ERROR SERVICIO " + e.getMessage());
        }
    }

    @Override
    public List<ClienteType> obtenerCliente() {
        return clienteService.obtenerClientes();
    }
}
