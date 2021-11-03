package junit5fixture;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordsTest {
    Words words;
    @BeforeEach
    void initWords(){
        words=new Words();
        words.addWord("alma");
        words.addWord("kefe");
        words.addWord("banán");
        words.addWord("öv");
        words.addWord("albatrosz");
    }
    @Test
    void testGetWordsStartWith(){
        words.getWordsStartWith("al");
        List<String>test=new ArrayList<>(Arrays.asList("alma","albatrosz"));
        assertEquals(test,words.getWords());
    }
    @Test
    void testGetWordsWithLength(){
        words.getWordsWithLength(4);
        List<String>test=new ArrayList<>(Arrays.asList("alma","kefe"));
        assertEquals(test,words.getWords());
    }
}
