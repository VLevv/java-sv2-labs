package collectionsset.game;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class QuestionGame {
    private List<RightAnswer> answers;

    public QuestionGame(List<RightAnswer> answers) {
        this.answers = answers;
    }

    public Set<String> drawWinners(){
        Set<String> result=new HashSet<>();
        while(!answers.isEmpty()&&result.size()!=5){
            RightAnswer tmp = answers.get(0);
            result.add(tmp.getName());
            while (answers.remove(tmp));
        }
        if(result.size()<5) throw new IllegalArgumentException("Not enough names");
        return result;
    }
}
