package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Second {
    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>();
        numberList.add(3);
        numberList.add(9);
        numberList.add(42);
        numberList.add(67);
        numberList.add(4);
        numberList.add(0);
        numberList.add(76);
        numberList.add(14);
        numberList.add(84);
        numberList.add(35);
        numberList.add(92);
        for (int i = 0;i<numberList.size();++i){
            if(i%2==1){
                System.out.println(numberList.get(i));
            }
        }
    }
}
