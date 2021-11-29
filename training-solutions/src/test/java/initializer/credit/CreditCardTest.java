package initializer.credit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardTest {

    @Test
    void testPayment() {
        CreditCard card = new CreditCard(30000);
        card.payment(3000);
        assertEquals(27000,card.getBalance());
        card.payment(10,Currency.USD);
        assertEquals(24000,card.getBalance());
        assertFalse(card.payment(40000));
    }
}