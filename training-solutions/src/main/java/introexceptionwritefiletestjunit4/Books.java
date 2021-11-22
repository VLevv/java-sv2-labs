package introexceptionwritefiletestjunit4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Books {
    public List<String> readFile(){
        try{
            return Files.readAllLines(Paths.get("src/main/resources/books.txt"));

        }catch (IOException ioe){
            throw new IllegalStateException("Can not read file",ioe);
        }
    }

    public void writeFile(Path path,List<String> data){
        try{
            Files.write(path,data);
        }catch (IOException ioe){
            throw new IllegalStateException("Error while file writing",ioe);
        }
    }

    public List<String> formatData(List<String> data){
        StringBuilder builder = new StringBuilder();
        List<String> results=new ArrayList<>();
        for (String s :
                data) {
            builder.append(s.substring(s.indexOf(";", s.indexOf(";") + 1) + 1));
            builder.append(": ");
            builder.append(s.substring(s.indexOf(";")+1,s.indexOf(";",s.indexOf(";")+1)));
            results.add(builder.toString());
            builder.delete(0,builder.length());
        }
        return results;
    }
}
