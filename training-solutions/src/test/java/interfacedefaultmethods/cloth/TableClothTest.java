package interfacedefaultmethods.cloth;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TableClothTest {

    @Test
    void testCloth(){
        TableCloth cloth = new TableCloth(4);

        assertEquals(4,cloth.getNumberOfSides());
        assertEquals(16,cloth.getPerimeter());
        assertEquals(16,cloth.getArea());
        assertEquals(Math.sqrt(2)*4,cloth.getLengthOfDiagonal());
    }

}