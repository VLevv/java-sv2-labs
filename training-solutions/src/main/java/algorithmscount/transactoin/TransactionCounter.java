package algorithmscount.transactoin;

import java.util.List;

public class TransactionCounter {
    public int countEntryLessThan(List<Transaction> transactions,int maxAmount){
        int c =0;
        for (Transaction t:
                transactions) {
            if(t.getTransactionType().equals(TransactionType.CREDIT)){
                if (t.getAmount() < maxAmount){
                c++;
                }
            }
        }
        return c;
    }
}
