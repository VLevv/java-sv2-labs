package introexceptionreadfiletestjunit4;

import org.junit.Test;

import java.nio.file.Paths;

import static org.junit.Assert.assertEquals;

public class WordsTest {
    @Test
    public void testRead(){
        assertEquals("alma",new Words().getWordWithA(Paths.get("src/main/java/introexceptionreadfiletestjunit4/words.txt")));
    }

    @Test
    public void testA(){
        assertEquals("A",new Words().getWordWithA(Paths.get("src/main/java/introexceptionreadfiletestjunit4/words2.txt")));
    }
}
