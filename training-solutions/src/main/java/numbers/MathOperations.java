package numbers;

import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("(3+4)*(5/6)-3=?");
        double answer = scanner.nextDouble();
        scanner.nextLine();
        if(Math.abs((3.833333333-answer))<0.0001){
            System.out.println("Szép volt!");
        }
        else{
            System.out.println("heh");
        }
    }
}
