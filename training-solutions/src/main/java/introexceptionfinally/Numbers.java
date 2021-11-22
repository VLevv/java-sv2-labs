package introexceptionfinally;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);
            int num;
            do {
                scanner.nextLine();
                System.out.println("Ajdon meg egy számot: ");
            }
            while((num= scanner.nextInt())%2!=0);
        }catch (NumberFormatException nfe){
            throw new IllegalArgumentException("Hibás bemenet",nfe);
        }finally{
            System.out.println("End of round");
        }
    }
}
