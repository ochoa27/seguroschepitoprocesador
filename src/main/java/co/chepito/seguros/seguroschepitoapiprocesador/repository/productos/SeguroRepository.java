package co.chepito.seguros.seguroschepitoapiprocesador.repository.productos;

import co.chepito.seguros.seguroschepitoapiprocesador.data.entity.productos.SeguroEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SeguroRepository extends JpaRepository<SeguroEntity, UUID> {

}
