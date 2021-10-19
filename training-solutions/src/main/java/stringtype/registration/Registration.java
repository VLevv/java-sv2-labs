package stringtype.registration;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String username = scanner.nextLine();
        String password1 = scanner.nextLine();
        String password2 = scanner.nextLine();
        String email = scanner.nextLine();
        UserValidator validator = new UserValidator();
        System.out.println(validator.isValidUsername(username));
        System.out.println(validator.isValidPassword(password1,password2));
        System.out.println(validator.isValidEmail(email));
    }
}
