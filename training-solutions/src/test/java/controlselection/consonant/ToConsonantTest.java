package controlselection.consonant;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ToConsonantTest {
    @Test
    void testConsonant(){
        ToConsonant consonant = new ToConsonant();
        assertEquals('b',consonant.consonant('a'));
        assertEquals('f',consonant.consonant('e'));
        assertEquals('j',consonant.consonant('i'));
        assertEquals('p',consonant.consonant('o'));
        assertEquals('v',consonant.consonant('u'));
        assertEquals('b',consonant.consonant('b'));
    }
}
