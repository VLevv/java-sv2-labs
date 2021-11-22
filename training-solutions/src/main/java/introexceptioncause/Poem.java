package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Poem {

    public List<String> readFile() {
        try{
            return Files.readAllLines(Paths.get("src/main/java/introexceptioncause/poem.txt"));
        }catch (IOException ioe){
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    public static void main(String[] args) {
        try{
            List<String> lines=new Poem().readFile();
            List<String> results=new ArrayList<>();
            for (String s :
                    lines) {
                results.add(s.substring(0,1));
            }
            System.out.println(results);
        }catch (IllegalStateException ise){
            ise.printStackTrace();
        }
    }


}
