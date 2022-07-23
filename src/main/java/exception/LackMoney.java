package exception;

public class LackMoney extends RuntimeException {

    public LackMoney() {
    }

    public LackMoney(String message) {
        super(message);
    }

    public LackMoney(String message, Throwable cause) {
        super(message, cause);
    }

    public LackMoney(Throwable cause) {
        super(cause);
    }
}
