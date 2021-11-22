package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class RoadMap {
    private List<String> map = Arrays.asList("Budapest", "Győr", "Sopron");

    public void writeFile(){
        try{
            Files.write(Paths.get("src/main/resources/radmap.txt"),map);
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new RoadMap().writeFile();
    }
}
