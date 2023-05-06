package es.base.cliente.dao.contract;

import es.base.cliente.dao.entity.ClienteEntity;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

//@ApplicationScoped
public class IClienteDAO implements PanacheRepository<ClienteEntity> {
}
