package co.chepito.seguros.seguroschepitoapiprocesador.domain.usuario.exception;

public class DuplicateEmailException extends RuntimeException{
    public DuplicateEmailException(String message) {
        super(message);
    }
}
