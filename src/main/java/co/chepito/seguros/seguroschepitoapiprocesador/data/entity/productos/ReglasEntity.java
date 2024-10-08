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
@Table(name = "reglas")
public class ReglasEntity {

    @Id
    //@GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "reglas_id", nullable = false)
    private UUID reglasId;

    @Column(name = "campo", nullable = false)
    private String campo;

    @Column(name = "valor", nullable = false)
    private String valor;

    @Column(name = "porcentaje", nullable = false)
    private double porcentaje;

    @Column(name = "tipo", nullable = false)
    private String tipo;

}

