package algorithmscount.transaction;

import algorithmscount.transactoin.Transaction;
import algorithmscount.transactoin.TransactionCounter;
import algorithmscount.transactoin.TransactionType;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TransactionTest {
    @Test
    void testCount(){
        List<Transaction> transactions= Arrays.asList(
                new Transaction(123, TransactionType.CREDIT,3000),
                new Transaction(123, TransactionType.DEBIT,3000),
                new Transaction(123, TransactionType.CREDIT,1000),
                new Transaction(123, TransactionType.DEBIT,4000),
                new Transaction(123, TransactionType.CREDIT,2000),
                new Transaction(123, TransactionType.CREDIT,6000)
        );
        assertEquals(2,new TransactionCounter().countEntryLessThan(transactions,3000));
    }
}
