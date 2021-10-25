package intromethods.registration;

import java.time.LocalDate;
import java.util.Scanner;

public class Registration {
    public String fullName(String firstName,String lastName){
        return firstName+lastName;
    }

    public LocalDate dateOfBirth(int year,int month, int day){
        return LocalDate.of(year,month,day);
    }

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        Registration registration = new Registration();
        System.out.println("Keresztnév: ");
        String firsName=scanner.nextLine();
        System.out.println("Családnév: ");
        String lastName=scanner.nextLine();
        System.out.println("Születési év: ");
        int year=scanner.nextInt();
        System.out.println("Születési hónap: ");
        int month=scanner.nextInt();
        System.out.println("Születési nap: ");
        int day=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Email: ");
        Person person = new Person(registration.fullName(firsName,lastName),registration.dateOfBirth(year,month,day),scanner.nextLine() );
        System.out.println(person);
    }
}
