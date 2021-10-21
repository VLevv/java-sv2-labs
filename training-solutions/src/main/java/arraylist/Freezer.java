package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Freezer {
    public static void main(String[] args) {


        List<String> freezer = new ArrayList<>();
        freezer.add("sonka");
        freezer.add("szalámi");
        freezer.add("tojás");
        freezer.add("szalonna");
        freezer.add("sajt");
        for (String str:freezer) {
            System.out.println(str);
        }
        freezer.remove(1);
        freezer.remove(3);
        for (String str:freezer) {
            System.out.println(str);
        }
    }
}
