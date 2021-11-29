package algorithmsfilter.prefix;

import java.util.ArrayList;
import java.util.List;

public class Prefix {
    public List<String> getWordsStartWith(List<String> words,String prefix){
        if(words==null){
            return null;
        }
        List<String> results=new ArrayList<>();
        for (String s :
                words) {
            if (s.startsWith(prefix)){
                results.add(s);
            }
        }
        return results;
    }
}
