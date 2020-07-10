package exception;

public class SetNotInitializedException extends RuntimeException {
    public SetNotInitializedException(String errorMessage) {
        super(errorMessage);
    }
}
