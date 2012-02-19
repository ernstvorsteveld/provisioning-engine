package nl.pengine.schema.domain.exception;

/**
 */
public class DecoratorException extends RuntimeException {

    private String message;

    public DecoratorException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
