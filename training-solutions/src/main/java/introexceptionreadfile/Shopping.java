package introexceptionreadfile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Shopping {
    public static void main(String[] args) {
        try{
            List<String> foods = Files.readAllLines(Paths.get("src/main/java/introexceptionreadfile/shoppinglist.txt"));
            for (String s :
                    foods) {
                System.out.println(s);
            }
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
