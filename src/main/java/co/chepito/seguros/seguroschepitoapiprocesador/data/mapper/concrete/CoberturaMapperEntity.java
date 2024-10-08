package co.chepito.seguros.seguroschepitoapiprocesador.data.mapper.concrete;

import co.chepito.seguros.seguroschepitoapiprocesador.data.mapper.MapperEntity;
import co.chepito.seguros.seguroschepitoapiprocesador.data.entity.productos.CoberturaEntity;
import co.chepito.seguros.seguroschepitoapiprocesador.domain.productos.CoberturaDomain;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CoberturaMapperEntity extends MapperEntity<CoberturaEntity, CoberturaDomain> {
    CoberturaDomain toDomain(CoberturaEntity entity);
    CoberturaEntity toEntity(CoberturaDomain domain);
}
