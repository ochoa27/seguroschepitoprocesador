package co.chepito.seguros.seguroschepitoapiprocesador.data.mapper.concrete;

import co.chepito.seguros.seguroschepitoapiprocesador.data.mapper.MapperEntity;
import co.chepito.seguros.seguroschepitoapiprocesador.data.entity.productos.ReglasEntity;
import co.chepito.seguros.seguroschepitoapiprocesador.domain.productos.ReglasDomain;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ReglasMapperEntity extends MapperEntity<ReglasEntity, ReglasDomain> {
    ReglasDomain toDomain(ReglasEntity entity);
    ReglasEntity toEntity(ReglasDomain domain);
}
