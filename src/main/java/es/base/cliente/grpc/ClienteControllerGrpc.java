package es.base.cliente.grpc;

import es.base.cliente.ClienteGrpcModel;
import es.base.cliente.ClienteGrpcServiceGrpc;
import es.base.cliente.Clientes;
import es.base.cliente.gen.type.ClienteType;
import es.base.cliente.services.impl.ClienteServiceImpl;
import es.base.cliente.utils.ClienteGrpcMapper;
import io.grpc.stub.StreamObserver;
import io.quarkus.grpc.GrpcService;
import io.smallrye.common.annotation.Blocking;
import jakarta.inject.Inject;

import java.util.List;

@GrpcService
public class ClienteControllerGrpc extends ClienteGrpcServiceGrpc.ClienteGrpcServiceImplBase {

    @Inject
    ClienteServiceImpl clienteService;

    @Inject
    ClienteGrpcMapper clienteGrpcMapper;

    @Blocking
    @Override
    public void consultarClientes(Clientes request, StreamObserver<ClienteGrpcModel> responseObserver) {

        List<ClienteType> clientes = clienteService.obtenerClientes();
        List<ClienteGrpcModel> clientesGrpc = clienteGrpcMapper.clienteTypeListToGrpc(clientes);

        for (ClienteGrpcModel clienteGrpc : clientesGrpc) {
            responseObserver.onNext(clienteGrpc);
        }

        responseObserver.onCompleted();

    }

}
