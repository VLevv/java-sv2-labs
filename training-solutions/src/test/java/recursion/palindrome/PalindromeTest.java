package recursion.palindrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeTest {
    @Test
    void testPalindrome(){
        assertTrue(new Palindrome().isPalindrome("Hannah"));
        assertFalse(new Palindrome().isPalindrome("Hanna"));
    }
}
