package es.base.cliente.grpc;

import es.base.cliente.ClienteGrpcModel;
import es.base.cliente.ClienteGrpcServiceGrpc;
import es.base.cliente.Clientes;
import es.base.cliente.ListaClientes;
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

    @Override
    @Blocking
    public void consultarClientes(Clientes request, StreamObserver<ListaClientes> responseObserver) {
        List<ClienteType> clientes = clienteService.obtenerClientes();
        System.out.println("Número de clientes recuperados: " + clientes.size());
        List<ClienteGrpcModel> clientesGrpc = clienteGrpcMapper.toClienteGrpcList(clientes);
        System.out.println("Número de clientes gRPC creados: " + clientesGrpc.size());

        ListaClientes.Builder listaClientesBuilder = ListaClientes.newBuilder();

        for (ClienteGrpcModel clienteGrpc : clientesGrpc) {
            listaClientesBuilder.addClientes(clienteGrpc);
        }

        ListaClientes listaClientes = listaClientesBuilder.build();
        responseObserver.onNext(listaClientes);
        responseObserver.onCompleted();
    }

}
