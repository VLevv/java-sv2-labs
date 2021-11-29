package algorithmsmax.hill;

import java.util.List;

public class Hill {
    public int getMax(List<Integer> integers){
        int max = integers.get(0);
        for (int i :
                integers) {
            if (max < i){
                max=i;
            }
        }
        return max;
    }
}
