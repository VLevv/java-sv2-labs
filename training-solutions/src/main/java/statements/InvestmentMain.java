package statements;

import java.util.Scanner;

public class InvestmentMain {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Adja meg az adatokat:");
        Investment investment=new Investment(scanner.nextInt(),scanner.nextInt());
        scanner.nextLine();
        System.out.println("Tőke: "+investment.getFund());
        System.out.println("Hozam 50 napra: "+investment.getYield(50));
        System.out.println("Kivett összeg 80 nap után: "+investment.close(80));
        System.out.println("Kivett összeg 90 nap után: "+investment.close(90));
    }
}
