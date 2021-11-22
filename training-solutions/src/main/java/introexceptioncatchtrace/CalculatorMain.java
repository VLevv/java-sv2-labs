package introexceptioncatchtrace;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        String operation;
        try {
            a = scanner.nextInt();
            scanner.nextLine();
            b = scanner.nextInt();
            scanner.nextLine();
            operation = scanner.nextLine();

        switch (operation){
            case "+":
                System.out.println(calculator.adder(a,b));
                break;
            case "-":
                System.out.println(calculator.subtract(a,b));
                break;
            case "*":
                System.out.println(calculator.multiply(a,b));
                break;
            case "/":
                try {
                    System.out.println(calculator.divide(a, b));
                }catch (ArithmeticException ae){
                    System.out.println("hehe");
                }
        }
        }catch (InputMismatchException exception){
            System.out.println("Rossz típust adott meg!");
        }
    }
}
