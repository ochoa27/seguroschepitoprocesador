package co.chepito.seguros.seguroschepitoapiprocesador.repository.productos;

import co.chepito.seguros.seguroschepitoapiprocesador.data.entity.productos.ReglasEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ReglasRepository extends JpaRepository<ReglasEntity, UUID> {
    ReglasEntity findByCampo(String campo);
}
