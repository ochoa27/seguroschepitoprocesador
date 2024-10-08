package co.chepito.seguros.seguroschepitoapiprocesador.repository.pagos;

import co.chepito.seguros.seguroschepitoapiprocesador.data.entity.pagos.PagosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface PagosRepository extends JpaRepository<PagosEntity, UUID> {
    List<PagosEntity> findByUsuario_Id(UUID usuarioId);
}

