package algorithmscount.bankaccount;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountConditionCounterTest {
    @Test
    void testCounter(){
        List<BankAccount> accounts = Arrays.asList(
                new BankAccount("Jani",123,30000),
                new BankAccount("Jani",123,20000),
                new BankAccount("Jani",123,40000),
                new BankAccount("Jani",123,50000),
                new BankAccount("Jani",123,30000)
        );
        assertEquals(2,new BankAccountConditionCounter().countWithBalanceGreaterThan(accounts,30000));
    }
}
