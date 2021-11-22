package introexceptioncheckedtrace;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Neptun {
    public List<String> readInfo() throws IOException{
        return Files.readAllLines(Paths.get("src/main/java/introexceptioncheckedtrace/neptun.csv"));
    }

    public static void main(String[] args) {
        try{
            List<String> data= new Neptun().readInfo();
            List<String> codes=new ArrayList<>();
            for (String s :
                    data) {
                codes.add(s.substring(s.indexOf(",")+1));
            }
            System.out.println(codes);
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
