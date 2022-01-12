package exceptions.sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersSumTest {

    @Test
    void testGetSum() {
        NumbersSum sum = new NumbersSum();
        int[] test = {1,2,3,4};
        String[] test1 = {"1","2","3","4"};
        int[] testErr=null;
        String[] testErr1 = {"1","2","3","4","a"};
        assertEquals(10,sum.getSum(test));
        assertEquals(10,sum.getSum(test1));
        assertThrows(IllegalArgumentException.class,()->sum.getSum(testErr));
        assertThrows(IllegalArgumentException.class,()->sum.getSum(testErr1));

    }
}