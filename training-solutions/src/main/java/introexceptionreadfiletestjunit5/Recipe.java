package introexceptionreadfiletestjunit5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Recipe {
    private List<String> ingredients=new ArrayList<>();

    public List<String> getIngredients() {
        return ingredients;
    }

    public void addIngredients(Path path){
        try{
            List<String> data=readFile(path);
            data.remove(0);
            data.remove(0);
            String[] tmp;
            for (String s :
                    data) {
                tmp = s.split(" ");
                ingredients.add(tmp[tmp.length-1]);
            }
        }catch (IllegalStateException ise){
            throw new IllegalStateException(ise);
        }
    }

    private List<String> readFile(Path path){
        try{
             return Files.readAllLines(path);

        }catch(IOException ioe){
            throw new IllegalStateException("Can not read file",ioe);
        }
    }
}
