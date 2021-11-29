package algorithmssum.transaction;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TransactionSumCalculatorTest {
    @Test
    void testSum(){
        List<Transaction> transactions= Arrays.asList(
                new Transaction(123,TransactionOperation.CREDIT,3000),
                new Transaction(123,TransactionOperation.CREDIT,2000),
                new Transaction(123,TransactionOperation.DEBIT,4000),
                new Transaction(123,TransactionOperation.CREDIT,6000),
                new Transaction(123,TransactionOperation.DEBIT,3000),
                new Transaction(123,TransactionOperation.CREDIT,4000)
        );
        assertEquals(15000,new TransactionSumCalculator().sumAmountOfCreditEntries(transactions));
    }
}
