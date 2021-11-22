package introexceptioncheckedtrace;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.List;

public class Operations {
    public List<String> readFile() throws IOException{
        return Files.readAllLines(Paths.get("src/main/java/introexceptioncheckedtrace/underground.txt"));
    }

    public String getDalySchedule(){
        try{
            List<String> data=readFile();
            StringBuilder builder = new StringBuilder(LocalDate.now().toString());
            builder.append(",");
            for (String s :
                    data) {
                if(s.charAt(0)=='2'){
                    builder.append(" ");
                    builder.append(s);
                }
            }
            return builder.toString();
        }catch (IOException ioe){
            return ioe.getMessage();
        }
    }
}
