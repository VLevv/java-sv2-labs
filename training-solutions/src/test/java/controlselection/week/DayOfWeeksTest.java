package controlselection.week;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DayOfWeeksTest {
    @Test
    void testWeeks(){
        DayOfWeeks day = new DayOfWeeks();
        assertEquals("hét eleje",day.days("hétfő"));
        assertEquals("hét közepe",day.days("kedd"));
        assertEquals("majdnem hétvége",day.days("Péntek"));
        assertEquals("hétvége",day.days("SZOMBAT"));
        assertEquals("ismeretlen nap",day.days("aSZOMBAT"));
    }
}
