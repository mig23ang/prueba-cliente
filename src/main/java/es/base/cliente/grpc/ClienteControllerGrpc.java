package es.base.cliente.grpc;

import es.base.cliente.ClienteGrpcModel;
import es.base.cliente.ClienteGrpcServiceGrpc;
import es.base.cliente.Clientes;
import es.base.cliente.ListaClientes;
import es.base.cliente.dao.contract.ClienteDAO;
import es.base.cliente.dao.entity.ClienteEntity;
import es.base.cliente.gen.type.ClienteType;
import es.base.cliente.services.impl.ClienteServiceImpl;
import es.base.cliente.utils.ClienteGrpcMapper;
import es.base.cliente.utils.ClienteMapper;
import io.grpc.stub.StreamObserver;
import io.quarkus.grpc.GrpcService;
import io.smallrye.common.annotation.Blocking;
import jakarta.inject.Inject;

import java.util.List;
import java.util.stream.Collectors;

@GrpcService
public class ClienteControllerGrpc extends ClienteGrpcServiceGrpc.ClienteGrpcServiceImplBase {

    @Inject
    ClienteDAO clienteDAO;

    @Inject
    ClienteServiceImpl clienteService;

    @Inject
    ClienteGrpcMapper clienteGrpcMapper;

    @Inject
    ClienteMapper clienteMapper;

    @Override
    @Blocking
    public void consultarClientes(Clientes request, StreamObserver<ListaClientes> responseObserver) {
        List<ClienteType> clientes = clienteService.obtenerClientes();
        List<ClienteGrpcModel> clientesGrpc = clientes.stream().map(clienteGrpcMapper::toClienteGrpc).collect(Collectors.toList());
        ListaClientes listaClientes = ListaClientes.newBuilder().addAllClientes(clientesGrpc).build();
        responseObserver.onNext(listaClientes);
        responseObserver.onCompleted();
    }
}
