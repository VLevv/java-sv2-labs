package classstructureio;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem adja meg a nevét majd az e-mail címét!");
        String name = scanner.nextLine();
        String email = scanner.nextLine();
        System.out.println("Neve: "+name);
        System.out.println("E-mail címe: "+email);

    }
}
