package interfacedefaultmethods.fileoperation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public interface FileOperations {
    default List<String> readFromFile(Path path){
        try{
            List<String> lines = Files.readAllLines(path);
            return lines;
        }catch (IOException ioe){
            throw new IllegalStateException("Can not read file.");
        }
    }

    String getLongWord();
}
