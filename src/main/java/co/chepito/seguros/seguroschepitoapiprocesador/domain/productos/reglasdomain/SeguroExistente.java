package co.chepito.seguros.seguroschepitoapiprocesador.domain.productos.reglasdomain;

import co.chepito.seguros.seguroschepitoapiprocesador.domain.productos.exception.SeguroDoesNotExist;
import co.chepito.seguros.seguroschepitoapiprocesador.repository.productos.SeguroRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class SeguroExistente {
    private final SeguroRepository seguroRepository;

    public SeguroExistente(SeguroRepository seguroRepository) {
        this.seguroRepository = seguroRepository;
    }

    public void validacionReglaId(UUID id) {
        if (!seguroRepository.existsById(id)) {
            throw new SeguroDoesNotExist("El id del seguro que intenta realizar una cotización no existe.");
        }
    }
}
