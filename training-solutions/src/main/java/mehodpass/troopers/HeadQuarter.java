package mehodpass.troopers;

import java.util.ArrayList;
import java.util.List;

public class HeadQuarter {
    private final List<Trooper> troopers= new ArrayList<>();

    public List<Trooper> getTroopers() {
        return troopers;
    }

    public void addTrooper(Trooper trooper){
        validation(trooper);
        troopers.add(trooper);
    }

    public void moveTrooperByName(String name,Position target){
        validation(target);
        if(name==null){
            throw new IllegalArgumentException("Name can not be null");
        }
        moveTrooper(findTrooperByName(name),target);
    }

    public void moveClosestTrooper(Position target){
        validation(target);
        moveTrooper(findClosestTrooper(target),target);
    }

    private Trooper findTrooperByName(String name){
        for (Trooper t:
             troopers) {
            if(name.equals(t.getName())){
                return t;
            }
        }
        return null;
    }

    private Trooper findClosestTrooper(Position target){
        double min=troopers.get(0).distanceFrom(target);
        for (Trooper trooper:
             troopers) {
            if(trooper.distanceFrom(target)<min){
                min=trooper.distanceFrom(target);
            }
        }
        for (Trooper t :
                troopers) {
            if (t.distanceFrom(target) == min) {
                return t;
            }
        }
        return null;
    }

    private void moveTrooper(Trooper trooper,Position target){
        trooper.changePosition(target);
    }

    private void validation(Position position){
        if(position==null){
            throw new IllegalArgumentException("Invalid data");
        }
    }

    private void validation(Trooper trooper){
        if(trooper==null){
            throw new IllegalArgumentException("Invalid data");
        }
    }
}
