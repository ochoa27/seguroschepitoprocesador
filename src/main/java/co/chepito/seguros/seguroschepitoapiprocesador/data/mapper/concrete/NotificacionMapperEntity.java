package co.chepito.seguros.seguroschepitoapiprocesador.data.mapper.concrete;

import co.chepito.seguros.seguroschepitoapiprocesador.data.mapper.MapperEntity;
import co.chepito.seguros.seguroschepitoapiprocesador.data.entity.notificaciones.NotificacionEntity;
import co.chepito.seguros.seguroschepitoapiprocesador.domain.notificaciones.NotificacionDomain;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface NotificacionMapperEntity extends MapperEntity<NotificacionEntity, NotificacionDomain> {
    NotificacionDomain toDomain(NotificacionEntity entity);
    NotificacionEntity toEntity(NotificacionDomain domain);
}
