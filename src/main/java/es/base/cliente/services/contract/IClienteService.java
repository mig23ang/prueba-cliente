package es.base.cliente.services.contract;

import es.base.cliente.dao.entity.ClienteEntity;
import es.base.cliente.gen.type.ClienteType;

import java.util.List;

public interface IClienteService {

    ClienteType crearCliente(ClienteEntity clienteEntity);

    List<ClienteType> obtenerClientes();
}
