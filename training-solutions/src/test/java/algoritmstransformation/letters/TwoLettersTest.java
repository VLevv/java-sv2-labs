package algoritmstransformation.letters;

import algorithmstransformation.letters.TwoLetters;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoLettersTest {
    @Test
    void testLetters(){
        assertEquals(Arrays.asList("ma","ka","sa"),new TwoLetters().getFirstTwoLetters(Arrays.asList(
                "mangó","kalap","sajt"
        )));
    }
}
