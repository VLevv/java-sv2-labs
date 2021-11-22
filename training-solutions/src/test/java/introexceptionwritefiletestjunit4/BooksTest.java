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

public class BooksTest {
    @Rule
    public TemporaryFolder temporaryFolder = new TemporaryFolder();

    @Test
    public void testBooks()throws IOException {
        Path path = temporaryFolder.newFile("formatednames.txt").toPath();
        List<String> data= new Books().readFile();
        data=new Books().formatData(data);
        new Books().writeFile(path,data);
        List<String> dataTest= Files.readAllLines(path);
        assertEquals(Arrays.asList("Gárdonyi Géza: Egri csillagok","Molnár Ferenc: Pál utcai fiúk","Fekete István: Tüskevár","Jókai Mór: Kőszívű ember fiai"),dataTest);
    }
}
