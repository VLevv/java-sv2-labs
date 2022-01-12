package exceptionclass.bank;

public class Account {
    private String accountNumber;
    private double balance;
    private double maxSubtract;

    public Account(String accountNumber, double balance) {
        if(accountNumber==null){
            throw new IllegalArgumentException("account number can not be null");
        }
        this.accountNumber = accountNumber;
        this.balance = balance;
        maxSubtract=100000;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public double getMaxSubtract() {
        return maxSubtract;
    }

    public void setMaxSubtract(double maxSubtract) {
        this.maxSubtract = maxSubtract;
    }

    public void subtract(double amount){
        if(amount>maxSubtract){
            throw new InvalidAmountBankOperationException("amount is too high");
        }
        if(amount>balance){
            throw new LowBalanceBankOperationException("not enough balance");
        }
        balance-=amount;
    }

    public void deposit(double amount){
        balance+=amount;
    }
}
