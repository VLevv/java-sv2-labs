package methodchain.word;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModifiedWordTest {
    @Test
    void testWord(){
        assertEquals("AxMy",new ModifiedWord().modify("alma"));
    }
}