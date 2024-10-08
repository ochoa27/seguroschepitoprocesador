package co.chepito.seguros.seguroschepitoapiprocesador.domain.usuario.exception;

public class DuplicateNumeroIdException extends RuntimeException{
    public DuplicateNumeroIdException(String message) {
        super(message);
    }
}
