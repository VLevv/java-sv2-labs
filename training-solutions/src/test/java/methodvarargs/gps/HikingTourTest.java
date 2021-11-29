package methodvarargs.gps;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class HikingTourTest {
    @Test
    void testTour(){
        HikingTour tour = new HikingTour();
        tour.logFieldPoints(LocalDateTime.now(),
                new FieldPoint(LocalDateTime.of(2021,11,21,04,04),34,23),
                new FieldPoint(LocalDateTime.of(2021,11,21,04,14),35,23),
                new FieldPoint(LocalDateTime.of(2021,11,21,04,24),36,23),
                new FieldPoint(LocalDateTime.of(2021,11,21,04,34),37,23)
                );
        assertEquals(LocalDateTime.of(2021,11,21,04,04),tour.getFieldPoints().get(0).getTimeOfSetting());
        assertEquals(36,tour.getFieldPoints().get(2).getLatitude());
        assertEquals(23,tour.getFieldPoints().get(2).getLongitude());
    }

}