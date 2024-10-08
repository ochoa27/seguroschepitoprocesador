package co.chepito.seguros.seguroschepitoapiprocesador.configuracion.seguridad.service;

import co.chepito.seguros.seguroschepitoapiprocesador.repository.usuario.IUsuarioRepositorio;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class CustomerDetalleUsuarioService implements UserDetailsService{

    private final IUsuarioRepositorio iUsuarioRepositorio;

    public CustomerDetalleUsuarioService(IUsuarioRepositorio iUsuarioRepositorio) {
        this.iUsuarioRepositorio = iUsuarioRepositorio;
    }

    @Override
    public UserDetails loadUserByUsername(String correo) throws UsernameNotFoundException {
        var usuarioEntidad = iUsuarioRepositorio.findByCorreo(correo);

        return new User(
                usuarioEntidad.getCorreo(),
                usuarioEntidad.getContrasena(),
                Collections.singletonList(new SimpleGrantedAuthority(usuarioEntidad.getRol()))
        );

    }
}
