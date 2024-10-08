package co.chepito.seguros.seguroschepitoapiprocesador.domain.pagos.reglas.validaciones;

import co.chepito.seguros.seguroschepitoapiprocesador.domain.pagos.BeneficiarioDomain;
import co.chepito.seguros.seguroschepitoapiprocesador.domain.pagos.reglas.ValidacionBeneficiario;
import co.chepito.seguros.seguroschepitoapiprocesador.utils.UtilidadTexto;
import org.springframework.stereotype.Service;

@Service
public class ValidacionNumeroTelefonoBeneficiario implements ValidacionBeneficiario<String> {

    @Override
    public void execute(String numeroTelefono) {
        validarObligatoriedad(numeroTelefono);
        validarLogitud(numeroTelefono);
        validarFormato(numeroTelefono);
    }

    @Override
    public void execute(BeneficiarioDomain beneficiarioDomain) {
        validarObligatoriedad(beneficiarioDomain.getNumero_contacto());
        validarLogitud(beneficiarioDomain.getNumero_contacto());
        validarFormato(beneficiarioDomain.getNumero_contacto());
    }

    private final void validarObligatoriedad(final String numeroTelefono) {
        if(UtilidadTexto.esVacio(numeroTelefono)) {
            throw new RuntimeException("El número de telefono no puede esatr vacio");
        }
    }

    private final void validarLogitud(final String numeroTelefono) {
        if(!UtilidadTexto.tieneLongitudExacta(numeroTelefono, 10)) {
            throw new RuntimeException("La longitud debe ser igual a 10");
        }
    }

    private final void validarFormato(final String numeroTelefono) {
        if(!UtilidadTexto.contieneSoloDigitos(numeroTelefono)) {
            throw new RuntimeException("El numero de telefono debe tener solo digiros");
        }
    }


}
