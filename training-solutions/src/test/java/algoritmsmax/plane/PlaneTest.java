package algoritmsmax.plane;

import algorithmsmax.plane.Plane;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlaneTest {
    @Test
    void testPlane(){
        assertEquals(16,new Plane().getLongestOcean("10000000111110000000000001111111111000010000010000100000111111110000101000000000111110000000000000000100000001000000000000111111000000000100000000000011"));
    }
}
