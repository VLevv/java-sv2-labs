package math.random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomDraw {
    public static void main(String[] args) {
        List<String> players = new ArrayList<>(Arrays.asList("jani", "pisti", "gyuri", "kati", "luca", "gergő", "matyi", "levi", "gabi", "laci"));
        Random random = new Random();
        System.out.println(players.get(random.nextInt(5)));
        System.out.println(players.get(random.nextInt(5)+5));
    }
}
