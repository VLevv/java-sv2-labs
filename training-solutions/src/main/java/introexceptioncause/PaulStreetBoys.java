package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class PaulStreetBoys {
public List<String> readFile(){
    try{
        return Files.readAllLines(Paths.get("src/main/java/introexceptioncause/palutcaifiuk.txt"));
    }catch (IOException ioe){
        throw new IllegalStateException("Can not read file",ioe);
    }
}

    public static void main(String[] args) {
        try{
            List<String> data=new PaulStreetBoys().readFile();
            for(int i = 0;i< data.size();++i){
                if(data.get(i).contains("Nemecsek")){
                    data.set(i, data.get(i).toLowerCase());
                }
            }
            System.out.println(data);
        }catch (IllegalStateException ise){
            ise.printStackTrace();
        }
    }
}
