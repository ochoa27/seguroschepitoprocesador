package co.chepito.seguros.seguroschepitoapiprocesador.repository.productos;

import co.chepito.seguros.seguroschepitoapiprocesador.data.entity.productos.CoberturaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CoberturaRepository extends JpaRepository<CoberturaEntity, UUID> {
}
