package algorithmssum.transaction;

import java.util.List;

public class TransactionSumCalculator {
    public int sumAmountOfCreditEntries(List<Transaction> transactions){
        int sum=0;
        for (Transaction t :
                transactions) {
            if (t.getTransactionOperation().equals(TransactionOperation.CREDIT)){
                sum+=t.getAmount();
            }
        }
        return sum;
    }
}
