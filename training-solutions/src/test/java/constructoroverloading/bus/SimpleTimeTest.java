package constructoroverloading.bus;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleTimeTest {

    @Test
    void getDifference() {
        assertEquals(3,new SimpleTime(3,23).getDifference(new SimpleTime(3,20)));
    }
}