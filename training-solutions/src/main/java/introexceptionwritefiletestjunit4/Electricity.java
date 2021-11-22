package introexceptionwritefiletestjunit4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Electricity {
    public List<String> createList(){
        List<String> data= new ArrayList<>();
        data.add("2016.04.05: Alma utca, Kocsis utca, József utca");
        data.add("2016.04.05: Kancsó utca, Csónak utca, Kolompár utca");
        data.add("2016.04.07: Karom utca, Banán utca, Teve utca");
        data.add("2016.04.12: Gábor utca, Benedek utca, Kapucs utca");
        return data;
    }

    public void writeStreets(Path path, List<String> data){
        try{
            Files.write(path,data);
        }catch (IOException ioe){
            throw new IllegalStateException("Error while writnig file",ioe);
        }
    }
}
