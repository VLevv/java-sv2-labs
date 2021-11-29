package algorithmsfilter.zoo;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ZooTest {
    @Test
    void testZoo(){
        Zoo zoo = new Zoo(Arrays.asList(
                new Animal("Tigris",4),
                new Animal("Oroszlán",4),
                new Animal("Elefánt",4),
                new Animal("Kobra",0),
                new Animal("Piton",0),
                new Animal("Veréb",2),
                new Animal("Gém",2)
        ));
        assertEquals("Piton",zoo.getAnimalsWithNumberOfLegsGiven(0).get(1).getName());
    }
}
