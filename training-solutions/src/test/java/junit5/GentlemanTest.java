package junit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GentlemanTest {
    @Test
    void testHello(){
        Gentleman gentleman = new Gentleman();
        String hello = gentleman.sayHello("Jon Doe");
        String hello2=gentleman.sayHello(null);
        assertEquals("Hello Jon Doe!",hello);
        assertEquals("Hello Anonymous!",hello2);
    }

}
