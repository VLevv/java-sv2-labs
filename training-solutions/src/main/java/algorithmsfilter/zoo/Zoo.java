package algorithmsfilter.zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> animals=new ArrayList<>();

    public Zoo(List<Animal> animals) {
        this.animals = animals;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void addAnimal(Animal animal){
        animals.add(animal);
    }

    public List<Animal> getAnimalsWithNumberOfLegsGiven(int numberOfLegs){
        List<Animal> results=new ArrayList<>();
        for (Animal a :
                animals) {
            if (a.getNumberOfLegs() == numberOfLegs) {
                results.add(a);
            }
        }
        return results;
    }
}
