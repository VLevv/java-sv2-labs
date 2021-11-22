package introexceptionthrow;

import java.util.Scanner;

public class ShortWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word= scanner.nextLine();
        if(word.length()>5){
            throw new IllegalArgumentException("Túl hosszú szó!");
        }
        for(int i = 0;i< word.length();++i){
            if(!Character.isAlphabetic(word.charAt(i))){
                throw new IllegalArgumentException("Hibás szó!");
            }
        }
        System.out.println(word);
    }
}
