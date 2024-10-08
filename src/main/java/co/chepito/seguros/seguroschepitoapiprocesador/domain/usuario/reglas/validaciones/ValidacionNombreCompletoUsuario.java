package co.chepito.seguros.seguroschepitoapiprocesador.domain.usuario.reglas.validaciones;

import co.chepito.seguros.seguroschepitoapiprocesador.domain.usuario.UsuarioDomain;
import co.chepito.seguros.seguroschepitoapiprocesador.domain.usuario.reglas.Validacion;
import co.chepito.seguros.seguroschepitoapiprocesador.utils.UtilidadTexto;
import org.springframework.stereotype.Service;

@Service
public class ValidacionNombreCompletoUsuario implements Validacion<UsuarioDomain> {

    @Override
    public void execute(UsuarioDomain usuarioDomain) {

        validarObligatoriedad(usuarioDomain);
        validarLogitud(usuarioDomain);
        validarFormato(usuarioDomain);
    }
    private void validarObligatoriedad(UsuarioDomain usuarioDomain) {
        validarObligatoriedNombre(usuarioDomain.getNombre());
        validarObligatoriedApellido(usuarioDomain.getApellido());
    }

    private void validarLogitud(UsuarioDomain usuarioDomain) {
       validarLogitudNombre(usuarioDomain.getNombre());
       validarLongitudApellido(usuarioDomain.getApellido());

    }
    private void validarFormato(UsuarioDomain usuarioDomain) {
        validarFormatoNombre(usuarioDomain.getNombre());
        validarFormatoApellido(usuarioDomain.getApellido());

    }

    private void validarObligatoriedNombre(String nombre) {
        if(UtilidadTexto.esNuloOVacio(nombre)) {
            throw new RuntimeException("El nombre no puede estar vacio");
        }
    }
    private void validarObligatoriedApellido(String apellido) {
        if(UtilidadTexto.esNuloOVacio(apellido)) {
            throw new RuntimeException("El apellido no puede esatr vacio");
        }
    }
    private  void validarLogitudNombre(final String nombre) {
        if(!UtilidadTexto.tieneLongitudMaxima(nombre, 12)) {
            throw new RuntimeException("La logitud maxima del nombre es de 12 caracteres");
        }
    }

    private final void validarLongitudApellido(final String apellido) {
        if(!UtilidadTexto.tieneLongitudMaxima(apellido, 12)) {
            throw new RuntimeException("La logitud maxima del apellido es de 12 caracteres");
        }
    }

    private void validarFormatoNombre(String nombre) {
        if(!UtilidadTexto.contieneSoloLetrasDigitos(nombre)) {
            throw new RuntimeException("El nombre solo puede tener letras o digitos");
        }
    }
    private void validarFormatoApellido(String apellido) {
        if(!UtilidadTexto.contieneSoloLetrasDigitos(apellido)) {
            throw new RuntimeException("El apellido solo puede tener letras o digitos");
        }
    }
}
