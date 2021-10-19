package introcontrol;

import java.util.Scanner;

public class BoatRental {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hány személy van?");
        int numberOfPersons=scanner.nextInt();
        if(numberOfPersons<=2){
            System.out.println("Két fős csónakot vitték el, 8 hely maradt!");
        }
        else{
            if(numberOfPersons==3){
                System.out.println("Három fős csónakot vitték el, 7 hely maradt!");
            }
            else {
                if(numberOfPersons<=5){
                    System.out.println("Öt fős csónakot vitték el, 5 hely maradt!");
                }
                else {
                    if(numberOfPersons<=7){
                        System.out.println("Két és Öt fős csónakokat vitték el, 3 hely maradt!");
                    }
                    else {
                        if(numberOfPersons==8){
                            System.out.println("Három és Öt fős csónakokat vitték el, 2 hely maradt!");
                        }
                        else {
                            if(numberOfPersons<=10){
                                System.out.println("Minden csónakot elvittek nincs több hely!");
                            }
                            else {
                                System.out.println("Minden csónakot elvittek nincs több hely!");
                                System.out.println("Még "+(numberOfPersons-10)+" ember várakozik!");
                            }
                        }
                    }
                }
            }
        }
    }
}
