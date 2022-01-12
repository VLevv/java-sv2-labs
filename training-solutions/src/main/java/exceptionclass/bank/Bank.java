package exceptionclass.bank;

import java.util.List;

public class Bank {
    private List<Account> accounts;

    public Bank(List<Account> accounts) {
        if(accounts==null){
            throw new IllegalArgumentException("no accounts were given");
        }
        this.accounts = accounts;
    }

    public void subtract(String accountNumber,double amount){
        int c=0;
        for (Account a :
                accounts) {
            if(a.getAccountNumber().equals(accountNumber)){
             a.subtract(amount);
             c++;
            }
        }
        if(c==0){
            throw new InvalidAccountNumberBankOperationException("invalid account number");
        }
    }

    public void deposit(String accountNumber,double amount){
        int c=0;
        for (Account a :
                accounts) {
            if(a.getAccountNumber().equals(accountNumber)){
                a.deposit(amount);
                c++;
            }
        }
        if(c==0){
            throw new InvalidAccountNumberBankOperationException("invalid account number");
        }
    }
}
