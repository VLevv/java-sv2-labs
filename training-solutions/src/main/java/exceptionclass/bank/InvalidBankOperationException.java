package exceptionclass.bank;

public class InvalidBankOperationException extends RuntimeException{
    public InvalidBankOperationException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidBankOperationException(String message) {
        super(message);
    }
}
