package introexceptionreadfiletestjunit5;

import introexceptionreadfiletestjunit4.Words;
import org.junit.jupiter.api.Test;

import java.nio.file.Paths;

import static org.junit.Assert.assertEquals;

public class WordsTest {
    @Test
    public void testRead(){
        assertEquals("alma",new introexceptionreadfiletestjunit4.Words().getWordWithA(Paths.get("src/main/java/introexceptionreadfiletestjunit4/words.txt")));
    }

    @Test
    public void testA(){
        assertEquals("A",new Words().getWordWithA(Paths.get("src/main/java/introexceptionreadfiletestjunit4/words2.txt")));
    }
}
