package introexceptionreadfile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Holiday {
    public static void main(String[] args) {
        try {
            List<String> items = Files.readAllLines(Paths.get("src/main/java/introexceptionreadfile/holiday.txt"));
            for (String s :
                    items) {
                System.out.println(s);
            }
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
