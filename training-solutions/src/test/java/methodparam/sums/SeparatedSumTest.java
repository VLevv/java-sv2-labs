package methodparam.sums;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class SeparatedSumTest {
    @Test
    void testSum(){
        try{
            assertEquals("110.6 -153.3",new SeparatedSum().sum( Files.readAllLines(Paths.get("src/main/resources/floatingnumbers.txt")).get(0)));
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}