package collectionsmap.trip;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class ClassTrip {
    private Map<String,Integer> payments=new HashMap<>();

    public Map<String, Integer> getPayments() {
        return payments;
    }

    public void LoadInPayments(Path path){
        try(BufferedReader reader = Files.newBufferedReader(path)){
            String tmp;
            while((tmp =reader.readLine())!=null){
                payments.put(tmp.substring(0,tmp.indexOf(":")),Integer.parseInt(tmp.substring(tmp.indexOf(":")+2)));
            }
        }catch (IOException e){
            throw new IllegalStateException("Can not read file");
        }
    }
}
