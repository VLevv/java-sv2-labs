package exceptionclass.bank;

public class InvalidAmountBankOperationException extends InvalidBankOperationException{
    public InvalidAmountBankOperationException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidAmountBankOperationException(String message) {
        super(message);
    }
}
