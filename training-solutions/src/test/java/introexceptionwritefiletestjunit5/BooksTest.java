package introexceptionwritefiletestjunit5;

import introexceptionwritefiletestjunit4.Books;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BooksTest {
    @TempDir
    File temporaryFolder;

    @Test
    public void testBooks()throws IOException {
        Path path = temporaryFolder.toPath().resolve("formatednames.txt");
        List<String> data= new introexceptionwritefiletestjunit4.Books().readFile();
        data=new introexceptionwritefiletestjunit4.Books().formatData(data);
        new Books().writeFile(path,data);
        List<String> dataTest= Files.readAllLines(path);
        assertEquals(Arrays.asList("Gárdonyi Géza: Egri csillagok","Molnár Ferenc: Pál utcai fiúk","Fekete István: Tüskevár","Jókai Mór: Kőszívű ember fiai"),dataTest);
    }
}
