package co.chepito.seguros.seguroschepitoapiprocesador.domain.usuario.reglasdomain;

import co.chepito.seguros.seguroschepitoapiprocesador.domain.usuario.exception.DuplicateEmailException;
import co.chepito.seguros.seguroschepitoapiprocesador.repository.usuario.IUsuarioRepositorio;
import org.springframework.stereotype.Service;

@Service
public class UnicoEmailRegla {
    private final IUsuarioRepositorio iUsuarioRepositorio;


    public UnicoEmailRegla(IUsuarioRepositorio iUsuarioRepositorio) {
        this.iUsuarioRepositorio = iUsuarioRepositorio;
    }

    public void validacionReglaEmail(String correo){
        if(iUsuarioRepositorio.existsByCorreo(correo)){
            throw new DuplicateEmailException("El correo "+ correo+ " ya esta registrado.");
        }
    }
}
