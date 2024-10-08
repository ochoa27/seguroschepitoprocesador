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
public class ReglasDomain {
    private UUID reglasId;
    private String campo;
    private String valor;
    private String tipo;
    private double porcentaje;
}
