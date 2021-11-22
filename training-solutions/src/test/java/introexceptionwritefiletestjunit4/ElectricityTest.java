package introexceptionwritefiletestjunit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ElectricityTest {
    @Rule
    public TemporaryFolder temporaryFolder = new TemporaryFolder();

    @Test
    public void testElec() throws IOException {
        Path path = temporaryFolder.newFile("electicity.txt").toPath();
        List<String> data = new Electricity().createList();
        new Electricity().writeStreets(path,data);
        List<String> dataTest= Files.readAllLines(path);
        assertEquals(Arrays.asList("2016.04.05: Alma utca, Kocsis utca, József utca","2016.04.05: Kancsó utca, Csónak utca, Kolompár utca","2016.04.07: Karom utca, Banán utca, Teve utca","2016.04.12: Gábor utca, Benedek utca, Kapucs utca"),dataTest);
    }
}
