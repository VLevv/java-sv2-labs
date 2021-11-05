package controladvaced.numbers;

import java.util.Scanner;

public class ForbiddenSeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num =scanner.nextInt();
        String s;
        while (true){
            if(num%7==0){
                System.out.print("x ");
                num++;
                continue;
            }
            else{
                s=Integer.toString(num);
                s=s.substring(s.length()-1);
                if(Integer.parseInt(s)==7){
                    break;
                }
            }
            System.out.print(num+" ");
            ++num;
        }
    }
}
