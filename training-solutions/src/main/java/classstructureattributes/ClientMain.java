package classstructureattributes;

import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Client client = new Client();
        System.out.println("Kérem adja meg a nevét, születési évét és a lakcímét!");
        client.name=scanner.nextLine();
        client.year=scanner.nextInt();
        scanner.nextLine();
        client.address=scanner.nextLine();
        System.out.println("Név:" +client.name);
        System.out.println("Születési év: "+client.year);
        System.out.println("Cím: "+client.address);
    }
}
