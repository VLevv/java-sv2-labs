package statements;

import java.util.Scanner;

public class TimeMain {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Adja meg az időpontot óra, perc, másodperc formátumban!");
        Time time1=new Time(scanner.nextInt(),scanner.nextInt(),scanner.nextInt());
        scanner.nextLine();
        System.out.println("Adja meg az időpontot óra, perc, másodperc formátumban!");
        Time time2=new Time(scanner.nextInt(),scanner.nextInt(),scanner.nextInt());
        System.out.println("Az első időpont: "+time1.toString());
        System.out.println("Az második időpont: "+time2.toString());
        System.out.println("Az első időpont korábbi, a másodiknál:"+time1.earlierThan(time2));
    }
}
