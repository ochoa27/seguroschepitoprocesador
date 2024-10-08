package co.chepito.seguros.seguroschepitoapiprocesador.data.mapper.concrete;

import co.chepito.seguros.seguroschepitoapiprocesador.data.mapper.MapperEntity;
import co.chepito.seguros.seguroschepitoapiprocesador.data.entity.productos.ClausulaEntity;
import co.chepito.seguros.seguroschepitoapiprocesador.domain.productos.ClausulaDomain;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")

public interface ClausulaMapperEntity extends MapperEntity <ClausulaEntity, ClausulaDomain> {
    ClausulaDomain toDomain(ClausulaEntity entity);
    ClausulaEntity toEntity(ClausulaDomain domain);

}
