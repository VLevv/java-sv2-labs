package algorithmsdecision.towns;

import java.util.List;

public class Town {
    public boolean containsFewerHabitants(List<Integer> integers, int num){
        for (int i :
                integers) {
            if (i < num){
                return true;
            }
        }
        return false;
    }
}
