package debug;

import java.util.Arrays;
import java.util.List;

public class Debug {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("alma", "körte", "barack", "szilva");

        String peach = fruits.get(2);
        for (int i = 0; i < fruits.size(); i++) {
            if(fruits.get(i).contains(peach.substring(0, 2))){
                System.out.println(fruits.get(i).substring(0,2));
                break;
            }
        }

        int[] numbers = {3, 7, -2, 1, -4, 5};


        for (int i = 0; i < numbers.length; i++) {
            if(numbers[2]<2) {
                numbers[2]++;
                numbers[2]++;
            }
        }
        System.out.println(numbers[2]);
    }
}
