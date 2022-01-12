package exceptionresource.siblings;

import org.junit.jupiter.api.Test;

import java.nio.file.Paths;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SiblingsTest {

    @Test
    void getFullNames() {
        Siblings siblings = new Siblings();
        List<String> exp=List.of("Szabó Emese","Szabó Ferenc");
        assertEquals(exp,siblings.getFullNames("Szabó", Paths.get("src/test/resources/names.txt")));
    }
}