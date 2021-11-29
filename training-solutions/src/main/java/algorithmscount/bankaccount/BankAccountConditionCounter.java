package algorithmscount.bankaccount;

import java.util.List;

public class BankAccountConditionCounter {
    public int countWithBalanceGreaterThan(List<BankAccount> accounts,int minAmount){
        int c = 0;
        for (BankAccount b :
                accounts) {
            if (b.getBalance() > minAmount) {
                c++;
            }
        }
        return c;
    }
}
