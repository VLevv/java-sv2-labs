package compositionlist;

import java.util.ArrayList;
import java.util.List;

public class Capsules {
    private List<String> colors=new ArrayList<>();

    public void addLast(String color){
        colors.add(color);
    }

    public void addFirs(String color){
        colors.add(0,color);
    }

    public void removeLast(){
        colors.remove(colors.size()-1);
    }

    public void removeFirs(){
        colors.remove(0);
    }

    public List<String> getColors() {
        return colors;
    }

    public static void main(String[] args) {
        Capsules capsules = new Capsules();
        capsules.addLast("blue");
        capsules.addLast("red");
        capsules.addFirs("green");
        System.out.println(capsules.getColors());
        capsules.removeFirs();
        System.out.println(capsules.getColors());
    }
}
