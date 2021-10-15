package classstructureintegrate;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Kérem adja meg a számlaszámát, nevét és egyenlegét!");
        BankAccount bankAccount =new BankAccount(scanner.nextLine(),scanner.nextLine(),scanner.nextInt());
        System.out.println(bankAccount.getInfo());
        scanner.nextLine();
        System.out.println("Helyezze be a pénzt!");
        bankAccount.deposit(scanner.nextInt());
        scanner.nextLine();
        System.out.println(bankAccount.getInfo());
        System.out.println("Mennyit szeretne ki venni ?");
        bankAccount.withdraw(scanner.nextInt());
        System.out.println(bankAccount.getInfo());
    }
}
