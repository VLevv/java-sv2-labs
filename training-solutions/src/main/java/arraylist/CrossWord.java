package arraylist;

import java.util.ArrayList;
import java.util.List;

public class CrossWord {
    public static void main(String[] args) {
        List<String> cross = new ArrayList<>();
        cross.add("KULCS");
        cross.add("KÁLYHA");
        cross.add("LÓ");
        cross.add("AJTÓ");
        cross.add("CSERESZNYEFA");
        cross.add("TEJ");
        cross.add("FELHŐ");
        cross.add( "CIPŐ");
        cross.add("MOSODA");
        cross.add("KÁVÉTEJSZÍN");
        cross.add("CITERA");
        cross.add("BABA");
        for (String str:cross) {
            if(str.length()>=6){
                System.out.println(str);
            }
        }
    }
}
