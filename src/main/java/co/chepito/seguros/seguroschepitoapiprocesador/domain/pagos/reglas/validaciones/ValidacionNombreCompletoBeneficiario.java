package co.chepito.seguros.seguroschepitoapiprocesador.domain.pagos.reglas.validaciones;

import co.chepito.seguros.seguroschepitoapiprocesador.domain.pagos.BeneficiarioDomain;
import co.chepito.seguros.seguroschepitoapiprocesador.domain.pagos.reglas.ValidacionBeneficiario;
import co.chepito.seguros.seguroschepitoapiprocesador.utils.UtilidadTexto;
import org.springframework.stereotype.Service;

@Service
public class ValidacionNombreCompletoBeneficiario implements ValidacionBeneficiario<BeneficiarioDomain> {

    @Override
    public void execute(BeneficiarioDomain beneficiarioDomain) {
        validarObligatoriedad(beneficiarioDomain);
        validarLogitud(beneficiarioDomain);
        validarFormato(beneficiarioDomain);
    }

    private void validarObligatoriedad(BeneficiarioDomain beneficiarioDomain) {
        validarObligatoriedNombre(beneficiarioDomain.getNombre());
        validarObligatoriedApellido(beneficiarioDomain.getApellido());
    }

    private void validarLogitud(BeneficiarioDomain beneficiarioDomain) {
        validarLogitudNombre(beneficiarioDomain.getNombre());
        validarLongitudApellido(beneficiarioDomain.getApellido());
    }

    private void validarFormato(BeneficiarioDomain beneficiarioDomain) {
        validarFormatoNombre(beneficiarioDomain.getNombre());
        validarFormatoApellido(beneficiarioDomain.getApellido());
    }

    private void validarObligatoriedNombre(String nombre) {
        if (UtilidadTexto.esNuloOVacio(nombre)) {
            throw new RuntimeException("El nombre no puede estar vacio");
        }
    }

    private void validarObligatoriedApellido(String apellido) {
        if (UtilidadTexto.esNuloOVacio(apellido)) {
            throw new RuntimeException("El apellido no puede estar vacio");
        }
    }

    private void validarLogitudNombre(final String nombre) {
        if (!UtilidadTexto.tieneLongitudMaxima(nombre, 12)) {
            throw new RuntimeException("La longitud maxima del nombre es de 12 caracteres");
        }
    }

    private void validarLongitudApellido(final String apellido) {
        if (!UtilidadTexto.tieneLongitudMaxima(apellido, 12)) {
            throw new RuntimeException("La longitud maxima del apellido es de 12 caracteres");
        }
    }

    private void validarFormatoNombre(String nombre) {
        if (!UtilidadTexto.contieneSoloLetrasDigitos(nombre)) {
            throw new RuntimeException("El nombre solo puede tener letras o digitos");
        }
    }

    private void validarFormatoApellido(String apellido) {
        if (!UtilidadTexto.contieneSoloLetrasDigitos(apellido)) {
            throw new RuntimeException("El apellido solo puede tener letras o digitos");
        }
    }
}
