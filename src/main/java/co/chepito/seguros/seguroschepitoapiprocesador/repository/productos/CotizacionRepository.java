package co.chepito.seguros.seguroschepitoapiprocesador.repository.productos;

import co.chepito.seguros.seguroschepitoapiprocesador.data.entity.productos.CotizacionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface CotizacionRepository extends JpaRepository<CotizacionEntity, UUID> {
    List<CotizacionEntity> findByUsuario_Id(UUID usuarioId);
}


