package co.chepito.seguros.seguroschepitoapiprocesador.domain.productos.reglasdomain.impl;

import co.chepito.seguros.seguroschepitoapiprocesador.domain.productos.reglasdomain.CotizacionExistente;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class EditarCotizacionDomain {
    private CotizacionExistente cotizacionExistente;

    public EditarCotizacionDomain(CotizacionExistente cotizacionExistente) {
        this.cotizacionExistente = cotizacionExistente;
    }

    public void validacionReglasDominio(UUID id){
        cotizacionExistente.validacionReglaId(id);
    }
}
