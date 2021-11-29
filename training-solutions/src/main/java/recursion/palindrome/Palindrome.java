package recursion.palindrome;

import java.util.Locale;

public class Palindrome {
    public boolean isPalindrome(String word){
        if(word.length()<2){
            return true;
        }
        else {
            return (word.substring(0,1).toLowerCase().equals(word.substring(word.length()-1).toLowerCase())&&isPalindrome(word.substring(1,word.length()-1)));
        }
    }
}
