package conversions;

import java.util.ArrayList;
import java.util.List;

public class Digits {
    List<Integer> digits=new ArrayList<>();

    public List<Integer> getDigits() {
        return digits;
    }

    public void addDigitsToList(String text){
        for (int i = 0;i<text.length();++i){
            if(Character.isDigit(text.charAt(i))){
                digits.add(Integer.parseInt(text.substring(i,i+1)));
            }
        }
    }

    public static void main(String[] args) {
        Digits digits = new Digits();
        digits.addDigitsToList("3456gbjh3rgbtu3zg4t4rt234uzg");
        System.out.println(digits.getDigits());
    }
}
