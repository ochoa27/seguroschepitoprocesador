package co.chepito.seguros.seguroschepitoapiprocesador.data.mapper.concrete;

import co.chepito.seguros.seguroschepitoapiprocesador.domain.usuario.UsuarioDomain;
import org.mapstruct.Mapper;

import co.chepito.seguros.seguroschepitoapiprocesador.data.entity.usuario.UsuarioEntity;
import org.mapstruct.factory.Mappers;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;

import java.util.List;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring")
public interface IUsuarioMapperEntity {

	IUsuarioMapperEntity INSTANCE= Mappers.getMapper(IUsuarioMapperEntity.class);

	UsuarioEntity toEntity(UsuarioDomain usuarioDomain);
	UsuarioDomain toDomain(UsuarioEntity entidad);

	default Page<UsuarioDomain> UsuarioEntidadPageToUsuarioPage(Page<UsuarioEntity> usuarioEntidadPage) {
		List<UsuarioDomain> usuarioDomainList = usuarioEntidadPage.getContent()
				.stream()
				.map(this::toDomain)
				.collect(Collectors.toList());
		return new PageImpl<>(usuarioDomainList, usuarioEntidadPage.getPageable(), usuarioEntidadPage.getTotalElements());
	}

}
