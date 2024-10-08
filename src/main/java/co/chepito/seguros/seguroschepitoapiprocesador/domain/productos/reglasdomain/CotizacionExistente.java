package co.chepito.seguros.seguroschepitoapiprocesador.domain.productos.reglasdomain;

import co.chepito.seguros.seguroschepitoapiprocesador.domain.productos.exception.CotizacionDoesNotExist;
import co.chepito.seguros.seguroschepitoapiprocesador.repository.productos.CotizacionRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CotizacionExistente {
    private final CotizacionRepository cotizacionRepository;

    public CotizacionExistente(CotizacionRepository cotizacionRepository) {
        this.cotizacionRepository = cotizacionRepository;
    }

    public void validacionReglaId(UUID id) {
        if (!cotizacionRepository.existsById(id)) {
            throw new CotizacionDoesNotExist("El id de la cotización no existe.");
        }
    }
}
