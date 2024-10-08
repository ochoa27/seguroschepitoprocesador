package co.chepito.seguros.seguroschepitoapiprocesador.repository.pagos;

import co.chepito.seguros.seguroschepitoapiprocesador.data.entity.pagos.BeneficiarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface IBeneficiarioRepositorio extends JpaRepository<BeneficiarioEntity, UUID> {
    List<BeneficiarioEntity> findByPagoId(UUID pagoId);
}
