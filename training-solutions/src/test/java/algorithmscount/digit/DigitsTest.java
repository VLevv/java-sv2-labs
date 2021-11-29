package algorithmscount.digit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DigitsTest {
    @Test
    void testCount(){
        assertEquals(9,new Digits().getCountOfNumbers());
    }
}
