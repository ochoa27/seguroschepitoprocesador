package co.chepito.seguros.seguroschepitoapiprocesador.domain.pagos;

import co.chepito.seguros.seguroschepitoapiprocesador.domain.productos.CotizacionDomain;
import co.chepito.seguros.seguroschepitoapiprocesador.domain.usuario.UsuarioDomain;
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
public class PagosDomain {
    private UUID id;
    private Date fecha;
    private CotizacionDomain cotizacion;
    private String tipoPago;
    private Double valorPago;
    private Date fechaPago;
    private String estado;
    private UsuarioDomain usuario;

}
