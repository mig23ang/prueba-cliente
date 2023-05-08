package es.base.cliente.utils;

import es.base.cliente.dao.entity.ClienteEntity;
import es.base.cliente.gen.type.ClienteType;
import jakarta.enterprise.context.ApplicationScoped;
import org.modelmapper.ModelMapper;
import org.modelmapper.config.Configuration;
import org.modelmapper.convention.MatchingStrategies;

@ApplicationScoped
public class ClienteMapper {

    private final ModelMapper modelMapper;

    public ClienteMapper() {
        this.modelMapper = new ModelMapper();

        // Configuración global de mapeo
        this.modelMapper.getConfiguration()
                .setFieldMatchingEnabled(true)
                .setFieldAccessLevel(Configuration.AccessLevel.PRIVATE)
                .setMatchingStrategy(MatchingStrategies.STRICT);

        // Mapeo de ClienteType a ClienteEntity
        this.modelMapper.typeMap(ClienteType.class, ClienteEntity.class);
    }

    public ClienteEntity toCliente(ClienteType clienteType) {
        return modelMapper.map(clienteType, ClienteEntity.class);
    }

    public ClienteType toClienteType(ClienteEntity clienteEntity) {
        return modelMapper.map(clienteEntity, ClienteType.class);
    }

}
