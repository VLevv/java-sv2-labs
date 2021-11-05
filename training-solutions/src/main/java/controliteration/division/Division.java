package controliteration.division;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adjon meg egy pozitív egész számot! A program ennél kisebb számokat fog kiíírni.");
        int num = scanner.nextInt();
        scanner.hasNextLine();
        System.out.println("Hánnyal osztható számokat szeretne kapni?");
        int q = scanner.nextInt();
        int i = q;
        while (i<=num){
            System.out.println(i);
            i+=q;
        }
        for(int j = q;j<=num;j+=q){
            System.out.println(j);
        }
    }
}
