package methodstucture.bmi;

import algorithmsfilter.movie.Category;
import mehodstructure.bmi.BmiCategory;
import mehodstructure.bmi.BodyMass;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BodyMassTest {
    @Test
    void testBmi(){
        assertEquals(20,new BodyMass(20,1).getBodyMassIndex());
    }

    @Test
    void testCategory(){
        assertEquals(BmiCategory.NORMAL,new BodyMass(20,1).getBody());
        assertEquals(BmiCategory.UNDERWEIGHT,new BodyMass(10,1).getBody());
        assertEquals(BmiCategory.OVERWEIGHT,new BodyMass(30,1).getBody());
    }

    @Test
    void testThin(){
        assertTrue(new BodyMass(20,1).isThinnerThan(new BodyMass(30,1)));
        assertFalse(new BodyMass(20,1).isThinnerThan(new BodyMass(10,1)));
    }
}
