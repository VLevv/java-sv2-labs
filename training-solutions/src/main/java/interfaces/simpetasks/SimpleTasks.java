package interfaces.simpetasks;

import java.util.ArrayList;
import java.util.List;

public class SimpleTasks implements Runnable{
    private List<String> tasks = new ArrayList<>();

    public SimpleTasks(List<String> tasks) {
        this.tasks = new ArrayList<>(tasks);
    }

    public List<String> getTasks() {
        return tasks;
    }

    private boolean nextStep(){
        if(tasks.size()==0){
            return false;
        }
        tasks.remove(tasks.size()-1);
        if(tasks.size()>0){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public void run() {
        while(nextStep()!=false){
        }
    }
}
