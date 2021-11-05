package controlselection.greetings;

import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreetingsTest {
    @Test
    void testGreetings(){
        Greetings greetings = new Greetings();
        assertEquals("jó reggelt",greetings.greeter(LocalTime.of(6,0)));
        assertEquals("jó napot",greetings.greeter(LocalTime.of(10,0)));
        assertEquals("jó estét",greetings.greeter(LocalTime.of(19,0)));
        assertEquals("jó éjt",greetings.greeter(LocalTime.of(22,0)));
        assertEquals("jó éjt",greetings.greeter(LocalTime.of(1,0)));
    }
}
