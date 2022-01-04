package enumabstract.discount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiscountTest {

    @Test
    void testDiscount(){
        assertEquals(150,Discount.BLACK_FRIDAY_OFFER.getAmountToPay(100,2));
        assertEquals(200,Discount.BLACK_FRIDAY_OFFER.getAmountToPay(100,3));
        assertEquals(160,Discount.SPECIAL_OFFER.getAmountToPay(100,2));
    }
}