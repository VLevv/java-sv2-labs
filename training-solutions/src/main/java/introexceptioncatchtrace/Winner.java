package introexceptioncatchtrace;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Winner {
    private List<String> names = new ArrayList<>();

    public void addNames(String name){
        names.add(name);
    }

    public String getWinner(){
        Random random = new Random();
        return names.get(random.nextInt(names.size())).toUpperCase();
    }
}
