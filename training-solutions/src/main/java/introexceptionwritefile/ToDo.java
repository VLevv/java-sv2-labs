package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDo {
    public List<String> expandList(){
        List<String> data = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (!scanner.nextLine().equals("x")){
            data.add(scanner.nextLine());
        }
        return data;
    }

    public void writeFile(List<String> data){
        try{
            Files.write(Paths.get("src/main/resources/todos.txt"),data);
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new ToDo().writeFile(new ToDo().expandList());
    }
}
