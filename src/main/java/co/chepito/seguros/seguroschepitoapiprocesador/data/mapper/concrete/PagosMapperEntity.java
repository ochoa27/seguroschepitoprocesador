package co.chepito.seguros.seguroschepitoapiprocesador.data.mapper.concrete;

import co.chepito.seguros.seguroschepitoapiprocesador.data.mapper.MapperEntity;
import co.chepito.seguros.seguroschepitoapiprocesador.data.entity.pagos.PagosEntity;
import co.chepito.seguros.seguroschepitoapiprocesador.domain.pagos.PagosDomain;
import co.chepito.seguros.seguroschepitoapiprocesador.utils.UtilDate;
import org.mapstruct.Mapper;
import org.mapstruct.Named;

import java.text.ParseException;
import java.util.Date;

@Mapper(componentModel = "spring")
public interface PagosMapperEntity extends MapperEntity<PagosEntity, PagosDomain> {

    @Override
    @Named("toDomain")
    PagosDomain toDomain(PagosEntity entity);

    @Override
    @Named("toEntity")
    PagosEntity toEntity(PagosDomain domain);

    @Named("stringToDate")
    default Date stringToDate(String dateString) {
        try {
            return UtilDate.fromStringToDate(dateString);
        } catch (ParseException e) {
            throw new RuntimeException("Error parsing date: " + dateString, e);
        }
    }

    @Named("dateToString")
    default String dateToString(Date date) {
        if (date == null) {
            return null;
        }
        return UtilDate.formatDateToString(date);
    }
}
