package algorithmsdecison.words;

import algorithmsdecision.words.Word;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WordTest {
    @Test
    void testWord(){
        assertTrue(new Word().containsLongerWord(Arrays.asList("alma","banán","kocsi","mazsola"),"kapa"));
        assertFalse(new Word().containsLongerWord(Arrays.asList("alma","kapu"),"kolbász"));
    }
}
