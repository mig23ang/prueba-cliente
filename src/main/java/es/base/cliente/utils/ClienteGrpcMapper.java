package es.base.cliente.utils;

import es.base.cliente.ClienteGrpcModel;
import es.base.cliente.dao.entity.ClienteEntity;
import es.base.cliente.gen.type.ClienteType;
import jakarta.enterprise.context.ApplicationScoped;
import org.modelmapper.ModelMapper;
import org.modelmapper.config.Configuration;
import org.modelmapper.convention.MatchingStrategies;

@ApplicationScoped
public class ClienteGrpcMapper {

    private final ModelMapper modelMapper;

    public ClienteGrpcMapper() {
        this.modelMapper = new ModelMapper();

        this.modelMapper.getConfiguration()
                .setFieldMatchingEnabled(true)
                .setFieldAccessLevel(Configuration.AccessLevel.PRIVATE)
                .setMatchingStrategy(MatchingStrategies.STRICT);

        this.modelMapper.typeMap(ClienteType.class, ClienteGrpcModel.class);
    }

    public ClienteGrpcModel toClienteGrpc(ClienteType clienteType) {
        return modelMapper.map(clienteType, ClienteGrpcModel.class);
    }

    public ClienteEntity toClienteEntity(ClienteGrpcModel clienteGrpcModel) {
        return modelMapper.map(clienteGrpcModel, ClienteEntity.class);
    }

}
