package exceptions.measurement;

import org.junit.jupiter.api.Test;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MeasurementTest {

    @Test
    void testReadFromFile() {
        Measurement measurement = new Measurement();
        List<String> testLines=new ArrayList<>(Arrays.asList(
                "2,12.4,John Doe,a",
                "a,12.4,John Doe",
                "3,12a.4,John Doe",
                "4,12.4,JohnDoe",
                "a1,12a.4,John Doe",
                "7,12a.4,John Doe",
                "8,12.4",
                "9,12.4,"
        ));
        assertEquals(testLines,measurement.readFromFile(Paths.get("src/main/resources/measurementdata.csv")));
    }
}