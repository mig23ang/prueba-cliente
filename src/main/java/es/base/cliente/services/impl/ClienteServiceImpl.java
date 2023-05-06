package es.base.cliente.services.impl;

import es.base.cliente.dao.contract.ClienteDAO;
import es.base.cliente.dao.contract.IClienteDAO;
import es.base.cliente.dao.entity.ClienteEntity;
import es.base.cliente.gen.type.ClienteType;
import es.base.cliente.services.contract.IClienteService;
import es.base.cliente.utils.ClienteMapper;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Default;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class ClienteServiceImpl implements IClienteService {

    @Inject
    ClienteDAO clienteDAO;

    @Inject
    ClienteMapper clienteMapper;

    @Transactional
    @Override
    public ClienteType crearCliente(ClienteEntity clienteEntity) {
        try {
            clienteDAO.persist(clienteEntity);
            ClienteType createdType = clienteMapper.toClienteType(clienteEntity);
            return createdType;
        } catch (Exception e) {
            throw new RuntimeException("ERROR SERVICIO " + e.getMessage());
        }
    }


    @Override
    public List<ClienteType> obtenerClientes() {
        List<ClienteEntity> entityList = clienteDAO.listAll();
        return entityList.stream()
                .map(clienteMapper::toClienteType)
                .collect(Collectors.toList());
    }
}

