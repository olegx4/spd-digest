package exception;

public class SourceNotInitializedException extends RuntimeException {
    public SourceNotInitializedException(String errorMessage) {
        super(errorMessage);
    }
}
