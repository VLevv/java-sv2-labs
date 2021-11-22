package introexceptionthrow;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Validation validation= new Validation();
        System.out.println("Üdvözlet!");
        System.out.println("Név:");
        String name = scanner.nextLine();
        boolean valid=true;
        while(valid){
        try{
            validation.validateName(name);
            valid=false;
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            name= scanner.nextLine();
        }
        }
        System.out.println("Életkor:");
        valid=true;
        String ageString= scanner.nextLine();
        while (valid){
            try{
                validation.validateAge(ageString);
                valid=false;
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
                ageString= scanner.nextLine();
            }
        }
        System.out.println("Név: "+name);
        System.out.println("Kor: "+ageString);
        System.out.println("Sikeres regisztáció!");
    }
}
