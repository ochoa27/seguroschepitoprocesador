package co.chepito.seguros.seguroschepitoapiprocesador.domain.usuario.reglas;

public interface Validacion<D> {

    void execute(D data);
}
