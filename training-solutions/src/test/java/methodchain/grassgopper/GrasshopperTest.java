package methodchain.grassgopper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GrasshopperTest {
    @Test
    void testHopper(){
        Grasshopper grasshopper = new Grasshopper();
        grasshopper.moveZeroToThreeWithFiveHops();
        assertEquals(3,grasshopper.getPosition());
        grasshopper.hopOnce(Direction.POSITIVE);
        assertEquals(4,grasshopper.getPosition());
    }

}