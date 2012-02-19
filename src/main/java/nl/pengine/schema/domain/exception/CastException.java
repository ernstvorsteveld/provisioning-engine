package nl.pengine.schema.domain.exception;

/**
 */
public class CastException extends RuntimeException {

    private String message;

    public CastException(String message) {
        super();
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
