package co.chepito.seguros.seguroschepitoapiprocesador.domain.productos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CoberturaDomain {
    private UUID coberturaId;
    private String tipo;
    private String descripcion;
}
