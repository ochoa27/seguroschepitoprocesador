package co.chepito.seguros.seguroschepitoapiprocesador.domain.pagos.reglas.validaciones.impl;

import co.chepito.seguros.seguroschepitoapiprocesador.domain.pagos.BeneficiarioDomain;
import co.chepito.seguros.seguroschepitoapiprocesador.domain.pagos.reglas.validaciones.*;
import org.springframework.stereotype.Service;

@Service
public class ValidacionesBeneficiarioImpl {


    private final ValidacionNombreCompletoBeneficiario validacionNombreCompletoBeneficiario;
    private final ValidacionIdentificacionBeneficiario validacionIdentificacionBeneficiario;
    private final ValidacionCorreoBeneficiario validacionCorreoBeneficiario;
    private final ValidacionDireccionBeneficiario validacionDireccionBeneficiario;
    private final ValidacionNumeroTelefonoBeneficiario validacionNumeroTelefonoBeneficiario;

    public ValidacionesBeneficiarioImpl(ValidacionNombreCompletoBeneficiario validacionNombreCompletoBeneficiario,
                                        ValidacionIdentificacionBeneficiario validacionIdentificacionBeneficiario,
                                        ValidacionCorreoBeneficiario validacionCorreoBeneficiario,
                                        ValidacionDireccionBeneficiario validacionDireccionBeneficiario,
                                        ValidacionNumeroTelefonoBeneficiario validacionNumeroTelefonoBeneficiario) {
        this.validacionNombreCompletoBeneficiario = validacionNombreCompletoBeneficiario;
        this.validacionIdentificacionBeneficiario = validacionIdentificacionBeneficiario;
        this.validacionCorreoBeneficiario = validacionCorreoBeneficiario;
        this.validacionDireccionBeneficiario = validacionDireccionBeneficiario;
        this.validacionNumeroTelefonoBeneficiario = validacionNumeroTelefonoBeneficiario;
    }

    public void validaciones(BeneficiarioDomain beneficiarioDomain){

        validacionNombreCompletoBeneficiario.execute(beneficiarioDomain);

        validacionIdentificacionBeneficiario.execute(beneficiarioDomain.getNumero_id());

        validacionCorreoBeneficiario.execute(beneficiarioDomain.getCorreo());


        validacionDireccionBeneficiario.execute(beneficiarioDomain.getDireccion());

        validacionNumeroTelefonoBeneficiario.execute(beneficiarioDomain.getNumero_contacto());

    }
}
