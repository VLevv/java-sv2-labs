package constructoroverloading.bus;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BusTimeTableTest {

    @Test
    void testGetNextBus() {
        BusTimeTable timeTable = new BusTimeTable(4,13,5);
        assertThrows(IllegalArgumentException.class,()->timeTable.getNextBus(new SimpleTime(17,3)));
        assertEquals(10,timeTable.getNextBus(new SimpleTime(4,7)).getMinutes());
    }
}