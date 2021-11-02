package stringbasic.characters;

import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String learnString= scanner.nextLine();
        System.out.println("Betűzd a következő szót: "+learnString);
        char[] word=new char[learnString.length()];
        for(int i = 0;i<word.length;++i){
            word[i]=scanner.nextLine().charAt(0);
        }
        for (char c:word) {
            System.out.print(c);
        }
        System.out.println();
        String string= new String(word).intern();
        System.out.println(learnString.equals(string));
    }
}
