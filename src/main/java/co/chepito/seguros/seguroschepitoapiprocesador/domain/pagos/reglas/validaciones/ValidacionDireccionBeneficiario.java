package co.chepito.seguros.seguroschepitoapiprocesador.domain.pagos.reglas.validaciones;

import co.chepito.seguros.seguroschepitoapiprocesador.domain.pagos.BeneficiarioDomain;
import co.chepito.seguros.seguroschepitoapiprocesador.domain.pagos.reglas.ValidacionBeneficiario;
import co.chepito.seguros.seguroschepitoapiprocesador.utils.UtilidadTexto;
import org.springframework.stereotype.Service;

@Service
public class ValidacionDireccionBeneficiario implements ValidacionBeneficiario<String> {

    @Override
    public void execute(String direccion) {

        validarObligatoriedad(direccion);
        validarLogitud(direccion);
        validarFormato(direccion);
    }

    @Override
    public void execute(BeneficiarioDomain beneficiarioDomain) {
        validarObligatoriedad(beneficiarioDomain.getDireccion());
        validarLogitud(beneficiarioDomain.getDireccion());
        validarFormato(beneficiarioDomain.getDireccion());
    }

    private void validarObligatoriedad(final String direccion) {
        if(UtilidadTexto.esVacio(direccion)) {
            throw new RuntimeException("La direccion no puede esatar vacio");
        }
    }

    private void validarLogitud(final String direccion) {
        if(!UtilidadTexto.tieneLongitudValida(direccion, 8,40)) {
            throw new RuntimeException("La longitud debe estar entre 8 a 20 caracteres");
        }
    }

    private void validarFormato(final String direccion) {
        if(!UtilidadTexto.contieneSoloLetrasDigitosEspaciosEspeciales(direccion)) {
            throw new RuntimeException("El formato de la direccion no es valido");
        }
    }


}
