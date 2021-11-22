package introexceptionreadfiletestjunit4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Words {
    public String getWordWithA(Path path){
        try{
            List<String> data = Files.readAllLines(path);
            for (String s :
                    data) {
                if (s.toLowerCase().startsWith("a")) {
                    return s;
                }
            }
            return "A";
        }catch (IOException ioe){
            throw new IllegalStateException("Can not read file",ioe);
        }
    }
}
