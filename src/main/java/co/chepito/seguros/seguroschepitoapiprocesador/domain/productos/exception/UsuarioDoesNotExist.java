package co.chepito.seguros.seguroschepitoapiprocesador.domain.productos.exception;

public class UsuarioDoesNotExist  extends  RuntimeException{
    public UsuarioDoesNotExist(String message) {
        super(message);
    }
}
