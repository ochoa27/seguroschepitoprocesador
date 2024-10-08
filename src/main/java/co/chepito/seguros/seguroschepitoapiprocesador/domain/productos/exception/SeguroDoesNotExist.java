package co.chepito.seguros.seguroschepitoapiprocesador.domain.productos.exception;

public class SeguroDoesNotExist extends  RuntimeException{
    public SeguroDoesNotExist(String message) {
        super(message);
    }
}
