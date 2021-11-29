package defaultconstructor.simpledate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleDateFormatterTest {
    @Test
    void testFormat(){
        SimpleDate date = new SimpleDate();
        assertThrows(IllegalArgumentException.class,()->date.setDate(1800,13,212));
        date.setDate(2000,2,3);
        assertEquals("2000-2-3",new SimpleDateFormatter().formatDateString(date));
        assertEquals("2-3-2000",new SimpleDateFormatter().formatDateStringByCountryCode(CountryCode.EN,date));
        assertEquals("3-2-2000",new SimpleDateFormatter().formatDateStringByCountryCode(CountryCode.US,date));

    }
}