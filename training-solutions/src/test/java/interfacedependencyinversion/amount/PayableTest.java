package interfacedependencyinversion.amount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PayableTest {

    @Test
    void testGetPayableAmount() {
        Payable amount = new Amount();
        Payable cash = new Cash();
        Payable bank = new BankAtm();

        assertEquals(3333,amount.getPayableAmount(3333));
        assertEquals(3335,cash.getPayableAmount(3333));
        assertEquals(3330,cash.getPayableAmount(3332));
        assertEquals(3340,cash.getPayableAmount(3338));
        assertEquals(3000,bank.getPayableAmount(3333));
        assertEquals(4000,bank.getPayableAmount(3633));
    }
}