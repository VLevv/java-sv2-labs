package collectionsmap.trip;

import org.junit.jupiter.api.Test;

import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class ClassTripTest {

    @Test
    void loadInPayments() {
        ClassTrip trip = new ClassTrip();
        trip.LoadInPayments(Paths.get("src/test/resources/inpayments.txt"));
        assertEquals(5000,trip.getPayments().get("Nagy Béla"));
    }
}