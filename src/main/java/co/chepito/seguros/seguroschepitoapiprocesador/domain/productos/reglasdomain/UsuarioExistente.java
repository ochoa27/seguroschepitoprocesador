package co.chepito.seguros.seguroschepitoapiprocesador.domain.productos.reglasdomain;

import co.chepito.seguros.seguroschepitoapiprocesador.domain.productos.exception.UsuarioDoesNotExist;
import co.chepito.seguros.seguroschepitoapiprocesador.repository.usuario.IUsuarioRepositorio;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UsuarioExistente {
    private final IUsuarioRepositorio iUsuarioRepositorio;

    public UsuarioExistente(IUsuarioRepositorio iUsuarioRepositorio) {
        this.iUsuarioRepositorio = iUsuarioRepositorio;
    }

    public void validacionReglaId(UUID id) {
        if (!iUsuarioRepositorio.existsById(id)) {
            throw new UsuarioDoesNotExist("El id del usuario que intenta realizar una cotización no existe.");
        }
    }
}
