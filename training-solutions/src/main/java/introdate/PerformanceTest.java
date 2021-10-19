package introdate;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class PerformanceTest {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(1989, Month.JUNE,2);
        LocalTime start = LocalTime.of(18,00);
        LocalTime end= LocalTime.of(20,00);
    Performance performance= new Performance(date,"Queen",start,end);
        System.out.println(performance.getInfo());
    }
}
