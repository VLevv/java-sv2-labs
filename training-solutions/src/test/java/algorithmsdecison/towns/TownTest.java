package algorithmsdecison.towns;

import algorithmsdecision.towns.Town;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TownTest {
    @Test
    void testTown(){
        assertTrue(new Town().containsFewerHabitants(Arrays.asList(1,2,3,4,5),3));
        assertFalse(new Town().containsFewerHabitants(Arrays.asList(3,4,5),3));
    }
}
