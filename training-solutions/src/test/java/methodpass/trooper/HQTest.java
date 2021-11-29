package methodpass.trooper;

import mehodpass.troopers.HeadQuarter;
import mehodpass.troopers.Position;
import mehodpass.troopers.Trooper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class HQTest {
    HeadQuarter headQuarter = new HeadQuarter();
    @BeforeEach
    void init(){
        headQuarter.addTrooper(new Trooper("Jani"));
        headQuarter.addTrooper(new Trooper("Peti"));
    }

    @Test
    void testName(){
        headQuarter.moveTrooperByName("Jani",new Position(3.23,4.25));
        assertEquals(3.23,headQuarter.getTroopers().get(0).getPosition().getPosX());
        assertThrows(IllegalArgumentException.class,()->headQuarter.moveTrooperByName(null,null));
    }

    @Test
    void testClosest(){
        headQuarter.moveTrooperByName("Jani",new Position(3.23,4.25));
        headQuarter.moveClosestTrooper(new Position(1,1));
        assertEquals(1,headQuarter.getTroopers().get(1).getPosition().getPosX());
    }
}
