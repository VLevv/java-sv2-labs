package polymorphism.river;

import java.util.ArrayList;
import java.util.List;

public class Danube extends River{
    List<String> capitals=new ArrayList<>();

    public Danube(String name, int length, List<String> capitals) {
        super(name, length);
        this.capitals = capitals;
    }

    public List<String> getCapitals() {
        return capitals;
    }

    public static void main(String[] args) {
        Water water = new Danube("water",23,List.of("cap1","cap2","cap3"));
        River river = new Danube("river",23,List.of("cap1","cap2","cap3"));
        Danube danube = new Danube("danube",23,List.of("cap1","cap2","cap3"));

        System.out.println(water);
        System.out.println(river.getLength());
        System.out.println(river.getName());
        System.out.println(danube.getLength());
        System.out.println(danube.getName());
        System.out.println(danube.getCapitals());
    }
}
