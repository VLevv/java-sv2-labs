package junit5fixture;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShipTest {
    Ship ship;
    Ship ship1;
    Ship ship2;
    Ship ship3;
    @BeforeEach
    void initShip(){
        ship = new Ship("Titanic",1930,134.23);
        ship1 = new Ship("Continental",1940,234.12);
        ship2=null;
        ship3=ship;
    }
    @Test
    void testName(){
        assertEquals("Titanic",ship.getName());
    }
    @Test
    void testYearOfConstruction(){
        assertEquals(1930, ship.getYearOfConstruction());
        assertTrue(ship.getYearOfConstruction()==1930);
        assertFalse(ship.getYearOfConstruction()==1931);
    }
    @Test
    void testLength(){
        assertEquals(134.23, ship.getLength(),0.005);
    }
    @Test
    void testNull(){
        assertNotNull(ship);
        assertNull(ship2);
    }
    @Test
    void testSameObjects(){
        assertSame(ship,ship3);
    }
    @Test
    void testNotSameObject(){
        assertNotSame(ship,ship2);
    }
}
