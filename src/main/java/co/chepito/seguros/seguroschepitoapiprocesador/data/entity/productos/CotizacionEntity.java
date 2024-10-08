package co.chepito.seguros.seguroschepitoapiprocesador.data.entity.productos;

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
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cotizacion")
public class CotizacionEntity {

    @Id
    private UUID id;

    private double valor_anual;

    private Date fecha;

    @ManyToOne
    @JoinColumn(name="usuario")
    private UsuarioEntity usuario;

    @ManyToOne
    @JoinColumn(name = "seguro")
    private SeguroEntity seguro;

    private double valor_mensual;

    private boolean adquirido;
}
