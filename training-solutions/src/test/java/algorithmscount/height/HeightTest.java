package algorithmscount.height;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HeightTest {
    @Test
    void testHeight(){
        List<Integer> heights= Arrays.asList(
                178,
                178,
                158,
                168,
                163,
                175,
                173,
                162,
                140
        );
        assertEquals(3,new Height().countChildrenWithHeightGreaterThan(heights,175));    }
}
