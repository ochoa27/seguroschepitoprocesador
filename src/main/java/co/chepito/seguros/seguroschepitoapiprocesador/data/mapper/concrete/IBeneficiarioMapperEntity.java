package co.chepito.seguros.seguroschepitoapiprocesador.data.mapper.concrete;


import co.chepito.seguros.seguroschepitoapiprocesador.data.mapper.MapperEntity;
import co.chepito.seguros.seguroschepitoapiprocesador.domain.pagos.BeneficiarioDomain;
import co.chepito.seguros.seguroschepitoapiprocesador.data.entity.pagos.BeneficiarioEntity;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface IBeneficiarioMapperEntity extends MapperEntity<BeneficiarioEntity, BeneficiarioDomain> {

	BeneficiarioEntity toEntity(BeneficiarioDomain beneficiarioDomain);
	BeneficiarioDomain toDomain(BeneficiarioEntity entidad);
}
