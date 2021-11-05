package controliteration.day;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DayTest {
    @Test
    void testDay(){
        Hour hour = new Hour(7);
        Hour hour1 = new Hour(12);
        Hour hour2= new Hour(3);
        Hour hour3 = new Hour(23);
        Hour hour4 = new Hour(15);
        Hour hour5 = new Hour(17);
        Day day = new Day();
        day.addHour(hour);
        day.addHour(hour1);
        day.addHour(hour2);
        day.addHour(hour3);
        day.addHour(hour4);
        day.addHour(hour5);
        day.setDayPeriod();
        assertEquals(DayPeriod.DAYTIME,day.getHours().get(0).getPeriod());
        assertEquals(DayPeriod.NIGHTTIME,day.getHours().get(2).getPeriod());
    }
}
