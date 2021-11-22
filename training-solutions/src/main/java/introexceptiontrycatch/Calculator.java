package introexceptiontrycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int first=0;
        int second=0;
        String operation="";
        Scanner scanner = new Scanner(System.in);
        try {
            first = scanner.nextInt();
            scanner.nextLine();
             second= scanner.nextInt();
            scanner.nextLine();
             operation= scanner.nextLine();
        }
        catch (InputMismatchException input){
            System.out.println("Rossz sorrendben adta meg az adatokat!");
        }
        try {
            switch (operation) {
                case "összeadás":
                    System.out.println(first + second);
                    break;
                case "kivonás":
                    System.out.println(first - second);
                    break;
                case "szorzás":
                    System.out.println(first * second);
                    break;

                case "osztás":
                    System.out.println(first / second);
            }
        }
        catch (ArithmeticException arit){
            System.out.println("Hibás matematikai művelet!");
        }
    }
}
