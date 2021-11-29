package methodstucture.pendrives;

import mehodstructure.pendrives.Pendrive;
import mehodstructure.pendrives.Pendrives;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PendrivesTest {
    List<Pendrive> pendrives;
    @BeforeEach
    void init(){
        pendrives= Arrays.asList(
                new Pendrive("asd",100,1000),
                new Pendrive("asd",200,2000),
                new Pendrive("asd",300,3000),
                new Pendrive("asd",500,4000),
                new Pendrive("asd",300,5000),
                new Pendrive("asd",100,6000)
        );
    }
    @Test
    void testBest(){
        assertEquals(500,new Pendrives().getBest(pendrives).getCapacity());
    }

    @Test
    void testCheapest(){
        assertEquals(1000,new Pendrives().getCheapest(pendrives).getPrice());
    }

    @Test
    void testRise(){
        new Pendrives().risePriceWhereCapacity(pendrives,10,300);
        assertEquals(3300,pendrives.get(2).getPrice());
        assertEquals(5500,pendrives.get(4).getPrice());
    }
}
