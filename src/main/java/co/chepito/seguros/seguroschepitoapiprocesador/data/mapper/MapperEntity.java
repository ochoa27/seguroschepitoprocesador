package co.chepito.seguros.seguroschepitoapiprocesador.data.mapper;

public interface MapperEntity<E, D> {
    D toDomain(E entity);
    E toEntity(D domain);
}
