package staticattrmath.bank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTransactionTest {
    @Test
    void testBank(){
        BankTransaction transaction;
        BankTransaction.initTheDay();
        assertEquals(0,BankTransaction.getAverageOfTransaction());
        new BankTransaction(300000);
        assertEquals(300000,BankTransaction.getSumOfTransactions());
        new BankTransaction(100000);
        assertEquals(200000,BankTransaction.getAverageOfTransaction());
        assertEquals(100000,BankTransaction.getCurrentMinValue());
        assertEquals(300000,BankTransaction.getCurrentMaxValue());
    }
}