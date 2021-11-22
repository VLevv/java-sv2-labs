package introexceptionfinally;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Names {
    public static void main(String[] args) {
        try{
            List<String> names = Files.readAllLines(Paths.get("src/main/resources/dr1.txt"));
            int c=0;
            for (String s :
                    names) {
                if (s.startsWith("dr")) {
                    System.out.println(s);
                    break;
                }
                else {
                    c++;
                }
            }
            if(c== names.size()){
                System.out.println("");
            }
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
        finally {
            System.out.println("End of file reading");
        }
    }
}
