package introexceptionwritefiletestjunit5;

import introexceptionwritefiletestjunit4.Electricity;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ElectricityTest {
    @TempDir
    File temporaryFolder;

    @Test
    public void testElec() throws IOException {
        Path path = temporaryFolder.toPath().resolve("electricity.txt");
        List<String> data = new introexceptionwritefiletestjunit4.Electricity().createList();
        new Electricity().writeStreets(path,data);
        List<String> dataTest= Files.readAllLines(path);
        assertEquals(Arrays.asList("2016.04.05: Alma utca, Kocsis utca, József utca","2016.04.05: Kancsó utca, Csónak utca, Kolompár utca","2016.04.07: Karom utca, Banán utca, Teve utca","2016.04.12: Gábor utca, Benedek utca, Kapucs utca"),dataTest);
    }
}
