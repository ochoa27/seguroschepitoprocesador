package co.chepito.seguros.seguroschepitoapiprocesador.domain.pagos.reglas.validaciones;

import co.chepito.seguros.seguroschepitoapiprocesador.domain.pagos.BeneficiarioDomain;
import co.chepito.seguros.seguroschepitoapiprocesador.domain.pagos.reglas.ValidacionBeneficiario;
import co.chepito.seguros.seguroschepitoapiprocesador.utils.UtilidadTexto;
import org.springframework.stereotype.Service;

@Service
public class ValidacionIdentificacionBeneficiario implements ValidacionBeneficiario<String> {

    @Override
    public void execute(String identificacion) {

        validarObligatoriedad(identificacion);
        validarLogitud(identificacion);
        validarFormato(identificacion);
    }

    @Override
    public void execute(BeneficiarioDomain beneficiarioDomain) {
        validarObligatoriedad(beneficiarioDomain.getNumero_id());
        validarLogitud(beneficiarioDomain.getNumero_id());
        validarFormato(beneficiarioDomain.getNumero_id());
    }

    private final void validarObligatoriedad(final String identificacion) {
        if(UtilidadTexto.esVacio(identificacion)) {
            throw new RuntimeException("El número de identificación no puede esatr vacio");
        }
    }

    private final void validarLogitud(final String identificacion) {
        if(!UtilidadTexto.tieneLongitudExacta(identificacion, 10)) {
            throw new RuntimeException("La longitud debe ser igual a 10");
        }
    }

    private final void validarFormato(final String identificacion) {
        if(!UtilidadTexto.contieneSoloDigitos(identificacion)) {
            throw new RuntimeException("El número de identificación debe  contener solo digitos");
        }
    }


}
