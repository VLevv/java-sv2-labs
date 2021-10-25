package composition.person;

import java.util.Scanner;

public class Address {
    private String country;
    private String city;
    private String zipCode;

    public Address(String country, String city, String zipCode) {
        this.country = country;
        this.city = city;
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void correctData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("ország");
        country=scanner.nextLine();
        System.out.println("város");
        city=scanner.nextLine();
        System.out.println("zip code");
        zipCode=scanner.nextLine();
    }

    public String addressToString() {
        return "country=" + country + "\n" +
                "city=" + city + "\n" +
                "zipCode=" + zipCode;
    }
}
