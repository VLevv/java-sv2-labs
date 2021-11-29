package algoritmsmax.hill;

import algorithmsmax.hill.Hill;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HillTest {
    @Test
    void testHill(){
        List<Integer> integers = Arrays.asList(3,2,3,4,5,6,7,8);
        assertEquals(8,new Hill().getMax(integers));
    }
}
