package co.chepito.seguros.seguroschepitoapiprocesador.data.entity.pagos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Table(name="beneficiarios")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BeneficiarioEntity {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
	private UUID id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String apellido;

    @Column(nullable = false)
    private String tipo_id;

    @Column(nullable = false)
    private String numero_id;

    @Column(nullable = false)
    private String correo;

    @Column(nullable = false)
    private String ciudad;

    @Column(nullable = false)
    private String direccion;

    @ManyToOne
    @JoinColumn(name="pago")
    private PagosEntity pago;

    @Column(nullable = false)
    private String numero_contacto;
	    
}
