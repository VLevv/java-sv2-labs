package stringseparate;

import java.util.ArrayList;
import java.util.List;

public class Codes {
    public String getCodesStartWithLetter(List<String> codes){
        StringBuilder builder = new StringBuilder();
        builder.append("Betűvel kezdődő kódok: ");
        boolean first = true;
        for (String s :
                codes) {
            if(Character.isAlphabetic(s.charAt(0))){
            if (first) {
                first=false;
            }
            else {
                builder.append(", ");
            }
            builder.append(s);
            }
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("T57fbj");
        list.add("xtcu45");
        list.add("f578GVHd");
        list.add("6f578GVHd");
        Codes codes = new Codes();
        System.out.println(codes.getCodesStartWithLetter(list));
    }
}
