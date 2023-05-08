package es.base.cliente.graphql;

import es.base.cliente.dao.entity.ClienteEntity;
import es.base.cliente.gen.type.ClienteType;
import es.base.cliente.services.impl.ClienteServiceImpl;
import es.base.cliente.utils.ApplicationException;
import es.base.cliente.utils.ClienteMapper;
import jakarta.inject.Inject;
import jakarta.validation.Valid;
import org.eclipse.microprofile.graphql.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@GraphQLApi
public class ClienteGraphqlController {

    private static final Logger LOG = LoggerFactory.getLogger(ClienteGraphqlController.class);

    @Inject
    ClienteServiceImpl clienteService;

    @Inject
    ClienteMapper clienteMapper;

    @Query("getAllClientes")
    @Description("Obtiene todos los clientes desde graphql")
    public List<ClienteType> getAllClientes() {

        LOG.info("Inicia obtener Clientes en Controller graphql");
        try {
            List<ClienteType> clienteTypeList = clienteService.obtenerClientes();
            LOG.info("Termina obtener Clientes en Controller graphql");
            return clienteTypeList;

        } catch (ApplicationException e) {

            throw new ApplicationException("ERROR_SERVICIO: " + e.getMessage() + "en controller graphql");

        }
    }

    @Mutation("crearCliente")
    @Description("Crea un cliente desde graphql")
    public ClienteType crearCliente(@Name("clienteType") @Valid ClienteType clienteType) {

        LOG.info("Inicia crear Clientes en Controller graphql");
        try {
            ClienteEntity clienteEntity = clienteMapper.toCliente(clienteType);
            ClienteType createdClient = clienteService.crearCliente(clienteEntity);
            LOG.info("Termina crear Clientes en Controller graphql");
            return createdClient;

        } catch (ApplicationException e) {

            throw new ApplicationException("ERROR_SERVICIO: " + e.getMessage() + "en controller graphql");

        }
    }

}
