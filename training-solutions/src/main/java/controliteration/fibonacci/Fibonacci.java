package controliteration.fibonacci;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num=scanner.nextInt();
        int i=1;
        int num1=1;
        int num2=1;
        while (i<num){
            num2+=num1;
            num1= num2-num1;
            i++;
        }
        System.out.println(num1);
        num1=1;
        num2=1;
        for (int j = 1;j<num;++j){
            num2+=num1;
            num1= num2-num1;
        }
        System.out.println(num1);
    }
}
