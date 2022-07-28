package exception;

public class LackMoneyException extends RuntimeException {

    public LackMoneyException() {
    }

    public LackMoneyException(String message) {
        super(message);
    }

    public LackMoneyException(String message, Throwable cause) {
        super(message, cause);
    }

    public LackMoneyException(Throwable cause) {
        super(cause);
    }
}
