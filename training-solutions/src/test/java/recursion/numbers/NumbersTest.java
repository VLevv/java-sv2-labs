package recursion.numbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumbersTest {
    @Test
    void testNumbers(){
        int[] testArr={3,4,5,3};
        assertEquals(15,new Numbers().getSum(testArr));
    }
}
