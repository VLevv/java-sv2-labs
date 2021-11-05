package controlselection.month;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DayInMonthTest {
    @Test
    void testDays(){
        DayInMonth month = new DayInMonth();
        assertEquals(28,month.days(2003,"Február"));
        assertEquals(29,month.days(2000,"Február"));
        assertEquals(30,month.days(2000,"Április"));
        assertEquals(31,month.days(2000,"Január"));
        assertEquals(0,month.days(2000,"Januárasd"));
    }
}
