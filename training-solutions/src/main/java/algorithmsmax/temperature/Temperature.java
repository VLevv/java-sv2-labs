package algorithmsmax.temperature;

import java.util.List;

public class Temperature {
    public int getMin(List<Integer> integers){
        int min = integers.get(0);
        for (int i :
                integers) {
            if (min > i) {
                min=i;
            }
        }
        return min;
    }
}
