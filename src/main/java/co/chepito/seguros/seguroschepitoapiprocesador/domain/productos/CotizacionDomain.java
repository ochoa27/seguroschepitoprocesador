package co.chepito.seguros.seguroschepitoapiprocesador.domain.productos;

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
public class CotizacionDomain {
    private UUID id;
    private double valor_anual;
    private Date fecha;
    private UsuarioDomain usuario;
    private SeguroDomain seguro;
    private double valor_mensual;
    private boolean adquirido;
}
