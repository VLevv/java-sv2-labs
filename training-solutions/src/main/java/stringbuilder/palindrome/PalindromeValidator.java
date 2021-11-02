package stringbuilder.palindrome;

public class PalindromeValidator {
    public boolean isPalindrome(String word){
        StringBuilder builder = new StringBuilder(word);
        builder.reverse();
        return word.equalsIgnoreCase(builder.toString());
    }

    public static void main(String[] args) {
        PalindromeValidator validator = new PalindromeValidator();
        System.out.println(validator.isPalindrome("Anna"));
    }
}
