package methodstucture.pendrives;

import mehodstructure.pendrives.Pendrive;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PendriveTest {
    @Test
    void testRise(){
        Pendrive pendrive=new Pendrive("drive",100,3000);
        pendrive.risePrice(10);
        assertEquals(3300,pendrive.getPrice());
    }

    @Test
    void testCompare(){
        assertEquals(-1,new Pendrive("asd",10,1000).comparePricePerCapacity(new Pendrive("asd",10,2000)));
        assertEquals(1,new Pendrive("asd",10,1000).comparePricePerCapacity(new Pendrive("asd",10,200)));
        assertEquals(0,new Pendrive("asd",10,1000).comparePricePerCapacity(new Pendrive("asd",10,1000)));
    }

    @Test
    void testCheaper(){
        assertTrue(new Pendrive("asd",100,2000).isCheaperThan(new Pendrive("asd",100,3000)));
        assertFalse(new Pendrive("asd",100,2000).isCheaperThan(new Pendrive("asd",100,1000)));
    }
}
