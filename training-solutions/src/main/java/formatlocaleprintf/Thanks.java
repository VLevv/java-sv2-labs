package formatlocaleprintf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Thanks {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Jani","Gabi","Laci"));
        for (String s:names) {
            System.out.printf("Kedves %s! Örülünk, hogy termékünlet választotta!\n",s);
        }
    }
}
