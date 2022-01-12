package exceptions.measurement;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Measurement {
    public List<String> readFromFile(Path path){
        try{
            List<String> lines = Files.readAllLines(path);
            return validate(lines);
        }catch (IOException ioe){
            throw new IllegalStateException("Can not read file");
        }
    }

    public List<String> validate(List<String> list){
        List<String> errors=new ArrayList<>();
        for (String s :
                list) {
            if(!(canParse(s.split(","))&&isRightLength(s.split(","))&&isNameRightFormat(s.split(",")))){
                errors.add(s);
            }
        }
        return errors;
    }

    private boolean canParse(String[] line){
        for(int i=0;i<2;++i){
            for(int j =0;j<line[i].length();++j){
                if(Character.isAlphabetic(line[i].charAt(j))){
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isRightLength(String[] line){
        return line.length == 3 && !line[2].equals("");
    }

    private boolean isNameRightFormat(String[] line){
        return line[2].contains(" ");
    }

}
