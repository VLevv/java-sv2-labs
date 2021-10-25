package composition.person;

import java.util.Scanner;

public class Person {
    private String name;
    private String identificationCard;
    private Address address;

    public Person(String name, String identificationCard) {
        this.name = name;
        this.identificationCard = identificationCard;
    }

    public String getName() {
        return name;
    }

    public String getIdentificationCard() {
        return identificationCard;
    }

    public Address getAddress() {
        return address;
    }

    public void moveTo(Address address) {
        this.address = address;
    }

    public void correctData(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("név");
        name=scanner.nextLine();
        System.out.println("kártya");
        identificationCard=scanner.nextLine();
        System.out.println("cím");
        address.correctData();
    }

    public String personToString(){
        return "name: "+name+ "\n"+"card: "+identificationCard;
    }
}
