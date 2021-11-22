package introexceptionfirstexception;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder builder = new StringBuilder();
        System.out.println("Adja meg az adatokat:");
        builder.append("A mozijegy.hu rendszerben vásárolt jegyek adatai a következők: \n");
        builder.append("Vásárló neve: "+scanner.nextLine()+"\n");
        builder.append("Film címe: "+scanner.nextLine()+"\n");
        builder.append("Lefoglalt helyek: ");
        int row=scanner.nextInt();
        scanner.nextLine();
        int num=scanner.nextInt();
        for (int i = 1;i<=num;++i){
            if(i!=1){
                builder.append(", ");
            }
            builder.append(row+". sor "+i+". szék");
        }
        builder.append("\nJó szórakozást!");
        System.out.println(builder.toString());
    }
}
