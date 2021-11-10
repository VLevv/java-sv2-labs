package meetingrooms;

import java.util.Scanner;

public class MeetingRoomController {
    private Office office;

    public MeetingRoomController(Office office) {
        this.office = office;
    }

    public void readOffice(){
        Scanner scanner = new Scanner(System.in);
        int length=scanner.nextInt();
        scanner.nextLine();
        int width=scanner.nextInt();
        scanner.nextLine();
        String name=scanner.nextLine();
        MeetingRoom room = new MeetingRoom(name,length,width);
        office.addMeetingRoom(room);
    }

    public void runMenu(){
        Scanner scanner = new Scanner(System.in);
        int controlNumber;
        String name;
        do {
            printMenu();
            controlNumber=scanner.nextInt();
            scanner.nextLine();
            switch (controlNumber){
                case 1:
                    readOffice();
                    break;
                case 2:
                    office.printNames();
                    break;
                case 3:
                    office.printNamesReverse();
                    break;
                case 4:
                    office.printEvenNames();
                    break;
                case 5:
                    office.printAreas();
                    break;
                case 6:
                    office.printMeetingRoomsWithName(scanner.nextLine());
                    break;
                case 7:
                    office.printMeetingRoomsContains(scanner.nextLine());
                    break;
                case 8:
                    office.printAreasLargerThan(scanner.nextInt());
                    scanner.nextLine();
                    break;
                default:
                    break;
            }
        }
        while(controlNumber!=9);
    }

    public void printMenu(){
        System.out.println("1. Tárgyaló rögzítése\n" +
                "2. Tárgyalók sorrendben\n" +
                "3. Tárgyalók visszafele sorrendben\n" +
                "4. Minden második tárgyaló\n" +
                "5. Területek\n" +
                "6. Keresés pontos név alapján\n" +
                "7. Keresés névtöredék alapján\n" +
                "8. Keresés terület alapján\n" +
                "9. Kilépés");

    }

    public static void main(String[] args) {
        MeetingRoomController controller = new MeetingRoomController(new Office());
        controller.runMenu();
    }
}
