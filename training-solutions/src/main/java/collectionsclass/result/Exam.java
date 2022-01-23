package collectionsclass.result;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exam {
    private List<ExamResult> results;

    public Exam(List<ExamResult> results) {
        this.results = results;
    }

    public List<ExamResult> getResults() {
        return results;
    }

    public List<String> getNamesOfSucceededPeople(int places){
        Collections.sort(results);
        Collections.reverse(results);
        List<String> names = new ArrayList<>();
        for(int i = 0;i<places;++i){
            names.add(results.get(i).getName());
            if(i==results.size()-1){
                break;
            }
        }
        return names;
    }


}
