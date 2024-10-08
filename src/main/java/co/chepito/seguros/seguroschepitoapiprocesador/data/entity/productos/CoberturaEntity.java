package co.chepito.seguros.seguroschepitoapiprocesador.data.entity.productos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cobertura")
public class CoberturaEntity {
    @Id
    //@GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "cobertura_id", nullable = false)
    private UUID coberturaId;

    @Column(name = "tipo", nullable = false)
    private String tipo;

    @Column(name = "descripcion", nullable = false)
    private String descripcion;
}
