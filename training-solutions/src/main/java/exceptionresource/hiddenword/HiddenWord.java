package exceptionresource.hiddenword;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class HiddenWord {
    public String getHiddenWord(Path path){
        StringBuilder builder = new StringBuilder();
        try(Scanner scanner = new Scanner(path)){
            String tmp;
            while (scanner.hasNextLine()){
                tmp=scanner.nextLine();
                for(int i = 0;i<tmp.length();++i){
                    if(Character.isAlphabetic(tmp.charAt(i))){
                        builder.append(tmp.charAt(i));
                    }
                }
            }
        }catch (IOException e){
            throw new IllegalStateException("Can not read file",e);
        }
        return builder.toString();
    }
}
