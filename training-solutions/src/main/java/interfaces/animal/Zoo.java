package interfaces.animal;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> animals=new ArrayList<>();

    public Zoo(List<Animal> animals) {
        this.animals = new ArrayList<>(animals);
    }

    public int getNumberOfAllLegs(){
        int sum=0;
        for (Animal a :
                animals) {
            sum+=a.getNumberOfLegs();
        }
        return sum;
    }

    public int getNumberOfAnimals(){
        return animals.size();
    }
}
