package co.chepito.seguros.seguroschepitoapiprocesador.data.entity.pagos;

import co.chepito.seguros.seguroschepitoapiprocesador.data.entity.productos.CotizacionEntity;
import co.chepito.seguros.seguroschepitoapiprocesador.data.entity.usuario.UsuarioEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;


@Getter
@Setter
@NoArgsConstructor // Constructor sin argumentos requerido por JPA
@AllArgsConstructor
@Entity
@Table(name = "pagos")
public class PagosEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private Date fecha;

    private String tipoPago;

    private Double valorPago;

    private Date fechaPago;

    private String estado;

    @ManyToOne
    @JoinColumn(name="usuario")
    private UsuarioEntity usuario;

    @ManyToOne
    @JoinColumn(name="cotizacion")
    private CotizacionEntity cotizacion;
}
