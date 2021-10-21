package aslist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Island {
    public static void main(String[] args) {
        List<String> things = Arrays.asList("Terülj terülj asztal","machete","fürdőruha");
        System.out.println(things);
        things.set(2,"napernyő");
        System.out.println(things);
    }
}
