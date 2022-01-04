package interfacerules.bill;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Bill {
    public List<String> readBillItemsFromFile(Path path){
        try {
            List<String> lines = Files.readAllLines(path);
            return lines;
        }catch (IOException ioe){
            throw new IllegalStateException("Can not read file.",ioe);
        }
    }
}
