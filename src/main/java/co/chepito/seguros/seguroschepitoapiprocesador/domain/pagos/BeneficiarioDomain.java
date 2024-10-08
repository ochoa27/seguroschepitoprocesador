package co.chepito.seguros.seguroschepitoapiprocesador.domain.pagos;

import java.util.UUID;


import org.springframework.stereotype.Component;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Component
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class BeneficiarioDomain {

    @Setter
    @Getter
    private UUID id;
    private String nombre;
    private String apellido;
    private String tipo_id;
    private String numero_id;
    private String correo;
    private String ciudad;
    private String direccion;
    private PagosDomain pago;
    private String numero_contacto;

}

