package designPatterns.builder.exception;

public class InvalidYOEException extends RuntimeException {

    public InvalidYOEException() {
    }

    public InvalidYOEException(String message) {
        super(message);
    }

    public InvalidYOEException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidYOEException(Throwable cause) {
        super(cause);
    }

    public InvalidYOEException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
