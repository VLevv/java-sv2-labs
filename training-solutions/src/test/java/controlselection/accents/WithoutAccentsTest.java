package controlselection.accents;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WithoutAccentsTest {
    @Test
    void testAccents(){
        WithoutAccents accents = new WithoutAccents();
        assertEquals('a',accents.decent('á'));
        assertEquals('e',accents.decent('é'));
        assertEquals('i',accents.decent('í'));
        assertEquals('o',accents.decent('ó'));
        assertEquals('ö',accents.decent('ő'));
        assertEquals('u',accents.decent('ú'));
        assertEquals('ü',accents.decent('ű'));
        assertEquals('b',accents.decent('b'));
    }
}
