package co.chepito.seguros.seguroschepitoapiprocesador.domain.productos.exception;

public class CotizacionDoesNotExist extends  RuntimeException{
    public CotizacionDoesNotExist(String message) {
        super(message);
    }
}
