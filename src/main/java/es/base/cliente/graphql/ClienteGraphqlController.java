package es.base.cliente.graphql;

import es.base.cliente.dao.entity.ClienteEntity;
import es.base.cliente.gen.type.ClienteType;
import es.base.cliente.services.impl.ClienteServiceImpl;
import es.base.cliente.utils.ClienteMapper;
import jakarta.inject.Inject;
import jakarta.validation.Valid;
import org.eclipse.microprofile.graphql.*;

import java.util.List;

@GraphQLApi
public class ClienteGraphqlController {

    @Inject
    ClienteServiceImpl clienteService;

    @Inject
    ClienteMapper clienteMapper;

    @Query("getAllClientes")
    @Description("Obtiene todos los clientes CDT Digital")
    public List<ClienteType> getAllClientes() {

        List<ClienteType> clienteTypeList = clienteService.obtenerClientes();
        return clienteTypeList;
    }

    @Mutation("crearCliente")
    @Description("Crea un cliente CDT digital")
    public ClienteType crearCliente(@Name("clienteType") @Valid ClienteType clienteType) {
        ClienteEntity clienteEntity = clienteMapper.toCliente(clienteType);
        ClienteType createdClient = clienteService.crearCliente(clienteEntity);
        return createdClient;
    }

}
