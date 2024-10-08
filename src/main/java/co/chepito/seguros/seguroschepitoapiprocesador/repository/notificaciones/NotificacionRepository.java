package co.chepito.seguros.seguroschepitoapiprocesador.repository.notificaciones;

import co.chepito.seguros.seguroschepitoapiprocesador.data.entity.notificaciones.NotificacionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface NotificacionRepository extends JpaRepository<NotificacionEntity, UUID> {
    // Método para obtener todas las notificaciones de un usuario
    Optional<NotificacionEntity> findById(UUID uuid);
    List<NotificacionEntity> findByUsuarioId(UUID usuarioId);
    void deleteById(UUID id);
    Optional<NotificacionEntity> findByUsuarioIdAndReferenciaId(UUID usuarioId, UUID id);
    boolean existsByUsuarioIdAndReferenciaId(UUID usuarioId, UUID referenciaId);
}
