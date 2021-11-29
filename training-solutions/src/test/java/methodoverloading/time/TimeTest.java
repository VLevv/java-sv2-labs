package methodoverloading.time;

import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {

    @Test
    void testIsEqual() {
        Time time = new Time(LocalTime.of(3,3,3));
        assertTrue(time.isEqual(new Time(LocalTime.of(3,3,3))));
        assertFalse(time.isEqual(new Time(LocalTime.of(3,3,2))));
        assertTrue(time.isEqual(3,3,3));
        assertFalse(time.isEqual(3,3,2));
    }

    @Test
    void testIsEarlier() {
        Time time = new Time(LocalTime.of(3,3,3));
        assertTrue(time.isEarlier(new Time(LocalTime.of(3,3,4))));
        assertFalse(time.isEarlier(new Time(LocalTime.of(3,3,2))));
        assertTrue(time.isEarlier(3,3,4));
        assertFalse(time.isEarlier(3,3,2));
    }
}