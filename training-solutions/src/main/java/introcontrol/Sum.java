package introcontrol;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int sum=0;
        System.out.println("Adjon meg 5 számot:");
        for (int i =0;i<5;++i){
            sum=sum+scanner.nextInt();
        }
        System.out.println("Az összeg:"+sum);
    }
}
