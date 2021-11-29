package algorithmstransformation.letters;

import java.util.ArrayList;
import java.util.List;

public class TwoLetters {
    public List<String> getFirstTwoLetters(List<String> words){
        List<String> results = new ArrayList<>();
        for (String s :
                words) {
            results.add(s.substring(0,2));
        }
        return results;
    }
}
