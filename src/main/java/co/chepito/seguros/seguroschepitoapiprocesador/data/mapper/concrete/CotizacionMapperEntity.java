package co.chepito.seguros.seguroschepitoapiprocesador.data.mapper.concrete;

import co.chepito.seguros.seguroschepitoapiprocesador.data.mapper.MapperEntity;
import co.chepito.seguros.seguroschepitoapiprocesador.data.entity.productos.CotizacionEntity;
import co.chepito.seguros.seguroschepitoapiprocesador.domain.productos.CotizacionDomain;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CotizacionMapperEntity extends MapperEntity<CotizacionEntity, CotizacionDomain> {
    CotizacionDomain toDomain(CotizacionEntity entity);
    CotizacionEntity toEntity(CotizacionDomain domain);
}
