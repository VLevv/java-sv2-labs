package referances.dog;

import java.util.ArrayList;
import java.util.List;

public class Kennel {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        Dog dog=new Dog("Puli",3,"black");
        Dog dog1=new Dog("Vadász",5,"brown");
        Dog dog2=new Dog("Nagyudvari József István",7,"white");
        dogs.add(dog);
        dogs.add(dog1);
        dogs.add(dog2);
        System.out.println(dogs);
        Dog dog3=dogs.get(1);
        dog3.setColour("gold");
        System.out.println(dogs);
        Dog dog4=new Dog("Hentes",3,"black");
        System.out.println(dog4);
        dog4=dogs.get(1);
        System.out.println(dog4);
        dogs.add(dog4);
        Dog dog5=dog3;
        dog5.setColour("kék");
        System.out.println(dogs);
        List<Dog> dogs1=dogs;
        Dog dog6=dog3;
        dog6.setColour("green");
        System.out.println(dogs1);
        dog1=null;
        System.out.println(dogs1);
        Dog dog7 =dogs.get(1);
        dog7=null;
        System.out.println(dogs1);
        Dog dog8=dogs.get(1);
        dog8.setColour("red");
        System.out.println(dogs1);
    }
}
