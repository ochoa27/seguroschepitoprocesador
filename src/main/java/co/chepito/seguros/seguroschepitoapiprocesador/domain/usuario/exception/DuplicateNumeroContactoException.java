package co.chepito.seguros.seguroschepitoapiprocesador.domain.usuario.exception;

public class DuplicateNumeroContactoException extends RuntimeException{
    public DuplicateNumeroContactoException(String message) {
        super(message);
    }
}
