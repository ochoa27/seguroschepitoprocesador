package co.chepito.seguros.seguroschepitoapiprocesador.data.entity.notificaciones;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "notificacion")
public class NotificacionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(columnDefinition = "UUID")
    private UUID notificacionId;


    @Column(nullable = false)
    private UUID usuarioId;

    @Column(nullable = false)
    private UUID referenciaId;

    @Column(nullable = false)
    private String titulo;

    @Column(nullable = false)
    private String asunto;

    @Column(nullable = false)
    private String mensaje;

    @Column(nullable = false)
    private String origen;

    @Column(nullable = false)
    private Date fecha;
}