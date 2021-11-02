package stringseparate;

import java.util.ArrayList;
import java.util.List;

public class IceCream {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        List<String> types = new ArrayList<>();
        types.add("csoki");
        types.add("vanília");
        types.add("eper");
        types.add("citrom");
        types.add("puncs");
        types.add("kókusz");
        boolean first = true;
        builder.append("Ma kapható: ");
        for (String s :
                types) {
            if(first){
                first=false;
            }
            else {
                builder.append(", ");
            }
            builder.append(s);
        }
        builder.append(". Gyerekeknek féláron!");
        System.out.println(builder.toString());
    }
}
