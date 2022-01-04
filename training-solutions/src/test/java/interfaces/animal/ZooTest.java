package interfaces.animal;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ZooTest {

    Zoo zoo = new Zoo(Arrays.asList(
            new Worm(),
            new Worm(),
            new Duck(),
            new Duck(),
            new Duck(),
            new Lion(),
            new Lion(),
            new Lion()
    ));

    @Test
    void testGetNumberOfAllLegs() {
        assertEquals(18,zoo.getNumberOfAllLegs());
    }

    @Test
    void testGetNumberOfAnimals() {
        assertEquals(8,zoo.getNumberOfAnimals());
    }
}