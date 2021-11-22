package introexceptionfirstexception;

import java.util.Arrays;
import java.util.List;

public class Massage {
    public static void main(String[] args) {
        List<String> codedMessage = Arrays.asList("76", "101", "103", "121", "101", "110", "32", "115", "122", "233", "112", "32", "110", "97", "112", "111", "100", "33");
        int help;
        char charHelp;
        for (String s :
                codedMessage) {
            help=Integer.parseInt(s);
            charHelp= (char)help;
            System.out.print(charHelp);
        }
        List<String> anotherCodedMessage = Arrays.asList("69", "122", "32", "101", "103", "121", "32", "104", "105", "98", "225", "115", "32", "252", "122", "101", "110", "101", "116", "46");
        System.out.println();
        for (String s :
                anotherCodedMessage) {
            help=Integer.parseInt(s);
            charHelp= (char)help;
            System.out.print(charHelp);
        }
    }
}
