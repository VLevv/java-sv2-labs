package recursion.vowels;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VowelsTest {
    @Test
    void testVowels(){
        assertEquals(0,new Vowels().getNumberOfVowels("sdffds"));
        assertEquals(4,new Vowels().getNumberOfVowels("almatorta"));
    }
}
