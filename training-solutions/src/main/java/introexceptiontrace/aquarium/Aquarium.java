package introexceptiontrace.aquarium;

import java.util.ArrayList;
import java.util.List;

public class Aquarium {
    private List<Fish> ornamentalFish=new ArrayList<>();

    public List<Fish> getOrnamentalFish() {
        return ornamentalFish;
    }

    public void addFish(Fish fish) {
        ornamentalFish.add(fish);
    }

    public int getNumberOfFish() {
        return ornamentalFish.size();
    }

    public static void main(String[] args) {
        Aquarium aquarium = new Aquarium();
        Fish fish = new Fish("Clown","Orange");
        Fish fish1 = new Fish("Big","Yellow");
        Fish fish2 = new Fish("Small","Red");
        aquarium.addFish(fish);
        aquarium.addFish(fish1);
        aquarium.addFish(fish2);
        System.out.println(aquarium.getNumberOfFish());
    }
}
