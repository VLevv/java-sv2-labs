package finalmodifier;

import java.util.Arrays;
import java.util.List;

public class Week {
    public static void main(String[] args) {
        List<String> week = Arrays.asList("hétfő", "kedd", "szerda", "csütörtök", "péntek", "szombat", "vasárnap");
        String temp = week.get(1);
        week.set(1,week.get(2));
        week.set(2,temp);
    }
}
