package exception;

public class LackCostException extends RuntimeException {

    public LackCostException() {
    }

    public LackCostException(String message) {
        super(message);
    }

    public LackCostException(String message, Throwable cause) {
        super(message, cause);
    }

    public LackCostException(Throwable cause) {
        super(cause);
    }
}
