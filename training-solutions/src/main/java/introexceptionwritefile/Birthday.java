package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Birthday {

    public void writeFile(List<String> people){
        try{
            Files.write(Paths.get("src/main/resources/birthday.txt"),people);
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }

    public List<String> initData(){
        Scanner scanner = new Scanner(System.in);
        List<String> data = new ArrayList<>();
        System.out.println("Hány embert szeretne meghívni ?");
        int db = scanner.nextInt();
        scanner.nextLine();
        for(int i = 1;i<=db;++i){
            System.out.println("Adja meg az adatokat:");
            data.add(scanner.nextLine());
        }
        return data;
    }

    public static void main(String[] args) {
        new Birthday().writeFile(new Birthday().initData());
    }
}
