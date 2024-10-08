package co.chepito.seguros.seguroschepitoapiprocesador.data.entity.productos;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
@Table(name = "clausula")
public class ClausulaEntity {

    @Id
    //@GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "clausula_id", nullable = false)
    private UUID clausulaId;

    @Column(name = "tipo", nullable = false)
    private String tipo;

    @Column(name = "descripcion", nullable = false)
    private String descripcion;
}
