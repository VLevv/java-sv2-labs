package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TrackPoints {
    public List<String> readFile(){
        try{
            return Files.readAllLines(Paths.get("src/main/java/introexceptioncause/tracking.csv"));
        }catch (IOException ioe){
            throw new IllegalStateException("Can not open file",ioe);
        }
    }

    public List<Integer> getNumbersList(){
        try{
            List<String> data = readFile();
            List<Integer> results=new ArrayList<>();
            for (String s :
                    data) {
                results.add(Integer.parseInt(s.substring(s.indexOf(";",s.indexOf(";")+1)+1)));
            }
            return results;
        }catch (IllegalStateException ise){
            ise.printStackTrace();
            throw new IllegalStateException(ise);
        }
    }

    public void calculateDifference(){
        List<Integer> data=getNumbersList();
        for (int i = 0;i<data.size()-1;i++){
            System.out.println((data.get(i+1)- data.get(i)));
        }
    }

    public static void main(String[] args) {
        new TrackPoints().calculateDifference();
    }
}

