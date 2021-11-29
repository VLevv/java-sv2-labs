package algoritmsmax.tamperature;

import algorithmsmax.temperature.Temperature;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemperatureTest {
    @Test
    void testTemperature(){
        List<Integer> integers = Arrays.asList(3,2,3,4,5,6,7,8);
        assertEquals(2,new Temperature().getMin(integers));
    }
}
