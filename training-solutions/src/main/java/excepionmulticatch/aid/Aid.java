package excepionmulticatch.aid;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Aid {
    private int amount;

    public Aid(int amount) {
        this.amount = amount;
    }

    public List<String> countAmountsOfAid(Path path){
        try{
            List<String> results=new ArrayList<>();
            List<String> lines  = Files.readAllLines(path);
            for (String s :
                    lines) {
                results.add(s.substring(0,s.indexOf(":")+2)+amount/Integer.parseInt(s.substring(s.indexOf(":")+2)));
            }
            return results;
        }catch (IOException|NullPointerException|IndexOutOfBoundsException|ArithmeticException|NumberFormatException e){
            throw new IllegalStateException("Something went wrong while counting.",e);
        }
    }
}
