package aslist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sequence {
    public static void main(String[] args) {
        List<Integer> niceLine = new ArrayList<>(Arrays.asList(1,2));
        for (int i = 0;i<5;++i){
            niceLine.add(niceLine.get(i)*niceLine.get(i+1));

        }
        System.out.println(niceLine);
    }
}
