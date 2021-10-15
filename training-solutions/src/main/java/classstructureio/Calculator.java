package classstructureio;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adj meg két számot:" );
        int first=scanner.nextInt();
        int second=scanner.nextInt();
        System.out.println(first+ " + "+second);
        System.out.println(first+second);
    }
}
