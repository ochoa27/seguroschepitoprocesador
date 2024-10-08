package co.chepito.seguros.seguroschepitoapiprocesador.data.mapper.concrete;

import co.chepito.seguros.seguroschepitoapiprocesador.data.mapper.MapperEntity;
import co.chepito.seguros.seguroschepitoapiprocesador.data.entity.productos.SeguroEntity;
import co.chepito.seguros.seguroschepitoapiprocesador.domain.productos.SeguroDomain;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SeguroMapperEntity extends MapperEntity<SeguroEntity, SeguroDomain> {
    SeguroDomain toDomain(SeguroEntity entity);
    SeguroEntity toEntity(SeguroDomain domain);

}
