package statements;

import java.util.Scanner;

public class DivByThree {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Adj meg egy egész számot:");
        System.out.println("A megadott szám osztható hárommal: "+(scanner.nextInt()%3==0));
    }
}
