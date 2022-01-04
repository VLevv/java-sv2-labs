package statemachine.seatheater;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeatHeaterStateTest {
    @Test
    void testNext(){
        assertEquals(SeatHeaterState.MAX,SeatHeaterState.OFF.next());
    }

}