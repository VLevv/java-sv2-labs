package exceptionclass.bank;

public class InvalidAccountNumberBankOperationException extends InvalidBankOperationException{
    public InvalidAccountNumberBankOperationException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidAccountNumberBankOperationException(String message) {
        super(message);
    }
}
