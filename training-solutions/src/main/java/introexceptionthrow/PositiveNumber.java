package introexceptionthrow;

import java.util.Scanner;

public class PositiveNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input= scanner.nextLine();
        if(!Character.isDigit(input.charAt(0))){
            throw new IllegalArgumentException("Not a positive number!");
        }
        System.out.println(input);
    }
}
