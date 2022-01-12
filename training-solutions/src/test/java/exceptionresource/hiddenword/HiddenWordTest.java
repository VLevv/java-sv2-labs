package exceptionresource.hiddenword;

import org.junit.jupiter.api.Test;

import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class HiddenWordTest {

    @Test
    void getHiddenWord() {
        assertEquals("ALMAKÖRTE",new HiddenWord().getHiddenWord(Paths.get("src/test/resources/hiddenword.txt")));
    }
}