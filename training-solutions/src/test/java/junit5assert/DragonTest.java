package junit5assert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DragonTest {
    @Test
    void testName(){
        Dragon dragon = new Dragon("Kalabor",7,23.53);
        String name = dragon.getName();
        assertEquals("Kalabor",name);
        assertNotEquals("Dindo",name);
    }
    @Test
    void testNumberOfHeads(){
        Dragon dragon = new Dragon("Kalabor",7,23.53);
        int heads = dragon.getNumberOfHeads();
        assertEquals(7,heads);
        assertTrue(heads==7);
        assertFalse(heads==5);
    }
    @Test
    void testHeight(){
        Dragon dragon = new Dragon("Kalabor",7,23.53);
        double height=dragon.getHeight();
        assertEquals(23.53,height,0.005);
    }
    @Test
    void testNull(){
        Dragon dragon = new Dragon("Kalabor",7,23.53);
        Dragon dragon1 = null;
        assertNull(dragon1);
        assertNotNull(dragon);
    }
    @Test
    void testSameObject(){
        Dragon dragon = new Dragon("Kalabor",7,23.53);
        Dragon dragon1 = dragon;
        assertSame(dragon,dragon1);
    }
    @Test
    void testNotSame(){
        Dragon dragon = new Dragon("Kalabor",7,23.53);
        Dragon dragon1 = new Dragon("Kalabor",7,23.53);
        assertNotSame(dragon,dragon1);
    }

}
