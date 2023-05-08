package es.base.cliente.utils;

import es.base.cliente.ClienteGrpcModel;
import es.base.cliente.gen.type.ClienteType;
import jakarta.enterprise.context.ApplicationScoped;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class ClienteGrpcMapper {

    private final ModelMapper modelMapper;

    public ClienteGrpcMapper() {
        this.modelMapper = new ModelMapper();
    }

    public ClienteGrpcModel toClienteGrpc(ClienteType clienteType) {
        return modelMapper.map(clienteType, ClienteGrpcModel.class);
    }

    public List<ClienteGrpcModel> toClienteGrpcList(List<ClienteType> clienteTypeList) {
        List<ClienteGrpcModel> clienteGrpcList = new ArrayList<>();
        for (ClienteType clienteType : clienteTypeList) {
            ClienteGrpcModel clienteGrpc = toClienteGrpc(clienteType);
            clienteGrpcList.add(clienteGrpc);
        }
        return clienteGrpcList;
    }

}
