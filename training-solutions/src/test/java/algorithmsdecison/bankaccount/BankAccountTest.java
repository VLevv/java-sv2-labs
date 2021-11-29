package algorithmsdecison.bankaccount;

import algorithmsdecision.bankaccount.BankAccount;
import algorithmsdecision.bankaccount.BankAccountDecisionMaker;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {
    @Test
    void testBankAccount(){
        BankAccount account =new BankAccount("Jani",123,30000);
        account.deposit(2000);
        assertEquals(32000,account.getBalance());
        account.withdraw(4000);
        assertEquals(28000,account.getBalance());
    }

    @Test
    void testDecision(){
        List<BankAccount> accounts= Arrays.asList(
                new BankAccount("Jani",123,30000),
                new BankAccount("Jani",123,20000),
                new BankAccount("Jani",123,10000),
                new BankAccount("Jani",123,50000)
        );
        assertTrue(new BankAccountDecisionMaker().containsBalanceGreaterThan(accounts,30000));
        assertFalse(new BankAccountDecisionMaker().containsBalanceGreaterThan(accounts,50000));
    }
}
