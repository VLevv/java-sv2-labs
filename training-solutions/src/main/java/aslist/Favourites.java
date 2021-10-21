package aslist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Favourites {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> favorite = new ArrayList<>();
        System.out.println("Add meg a kedvenc játékodat:");
        favorite.add(scanner.nextLine());
        System.out.println("Add meg a kedvenc színedet:");
        favorite.add(scanner.nextLine());
        System.out.println("Add meg a kedvenc autómárkádat:");
        favorite.add(scanner.nextLine());
        System.out.println(favorite.size()+"\nA kedvenceid:");
        for (String str:favorite) {
            System.out.print(str+", ");
        }
    }
}
