package es.base.cliente.utils;

import es.base.cliente.ClienteGrpcModel;
import es.base.cliente.gen.type.ClienteType;
import jakarta.enterprise.context.ApplicationScoped;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class ClienteGrpcMapper {

    public ClienteGrpcModel clienteTypeToGrpc(ClienteType clienteType) {
        ModelMapper modelMapper = new ModelMapper();
        ClienteGrpcModel clienteGrpcModel = modelMapper.map(clienteType, ClienteGrpcModel.class);
        return clienteGrpcModel;
    }

    public List<ClienteGrpcModel> clienteTypeListToGrpc(List<ClienteType> clienteTypeList) {
        List<ClienteGrpcModel> clienteGrpcList = new ArrayList<>();
        for (ClienteType clienteType : clienteTypeList) {
            ClienteGrpcModel clienteGrpc = clienteTypeToGrpc(clienteType);
            clienteGrpcList.add(clienteGrpc);
        }
        return clienteGrpcList;
    }


}
