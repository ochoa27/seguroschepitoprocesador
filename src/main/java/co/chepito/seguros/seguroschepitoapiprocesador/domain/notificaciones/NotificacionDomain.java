package co.chepito.seguros.seguroschepitoapiprocesador.domain.notificaciones;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;

@Service
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NotificacionDomain {
    UUID notificacionId;
    UUID usuarioId;
    UUID referenciaId;
    String titulo;
    String asunto;
    String mensaje;
    String origen;
    Date fecha;

    @Override
    public String toString() {
        return "NotificacionesDomain{" +
                "notificacionId=" + notificacionId +
                ", usuarioId=" + usuarioId +
                ", referenciaId=" + referenciaId +
                ", titulo='" + titulo + '\'' +
                ", asunto='" + asunto + '\'' +
                ", mensaje='" + mensaje + '\'' +
                ", origen='" + origen + '\'' +
                ", fecha=" + fecha +
                '}';
    }
}
