package co.chepito.seguros.seguroschepitoapiprocesador.domain.pagos.reglas;

import co.chepito.seguros.seguroschepitoapiprocesador.domain.pagos.BeneficiarioDomain;

public interface ValidacionBeneficiario<D> {

    void execute(D data);

    void execute(BeneficiarioDomain beneficiarioDomain);
}
