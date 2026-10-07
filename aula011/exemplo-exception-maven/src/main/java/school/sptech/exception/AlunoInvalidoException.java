package school.sptech.exception;


// mais unchecked para nao forcar a tratar
public class AlunoInvalidoException extends RuntimeException {
    public AlunoInvalidoException(String message) {
        super(message);
    }

    public AlunoInvalidoException() {
    }
}
