package literals;

import java.util.Locale;

public class LiteralsMain {
    public static void main(String[] args) {
        System.out.println("1"+"2");
        double quotient = 3/4d;
        System.out.println(quotient);
        long big = 3_244_444_444L;
        String word = "title".toUpperCase();
        System.out.println(Integer.toBinaryString(1));
        System.out.println(Integer.toBinaryString(-2));
    }
}
