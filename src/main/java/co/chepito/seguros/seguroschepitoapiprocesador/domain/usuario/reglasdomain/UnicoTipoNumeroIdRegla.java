package co.chepito.seguros.seguroschepitoapiprocesador.domain.usuario.reglasdomain;

import co.chepito.seguros.seguroschepitoapiprocesador.domain.usuario.exception.DuplicateNumeroIdException;
import co.chepito.seguros.seguroschepitoapiprocesador.repository.usuario.IUsuarioRepositorio;
import org.springframework.stereotype.Service;

@Service
public class UnicoTipoNumeroIdRegla {
    private final IUsuarioRepositorio iUsuarioRepositorio;


    public UnicoTipoNumeroIdRegla(IUsuarioRepositorio iUsuarioRepositorio) {
        this.iUsuarioRepositorio = iUsuarioRepositorio;
    }

    public void validacionReglaNumeroId(String identificacion){
        if(iUsuarioRepositorio.existsByIdentificacion(identificacion)){
            throw new DuplicateNumeroIdException("El numero de identificacion "+ identificacion + " ya esta registrado.");
        }
    }
}
