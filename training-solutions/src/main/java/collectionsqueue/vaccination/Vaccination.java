package collectionsqueue.vaccination;

import java.util.*;

public class Vaccination {
    public Queue<Integer> getVaccinationOrder(List<Person> people){
        Queue<Integer> result= new PriorityQueue<>();
        for (Person p :
                people) {
            if(p.getAge()>18&&p.getAge()<65){
                result.add(p.getAge());
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Vaccination vaccination = new Vaccination();
        System.out.println(vaccination.getVaccinationOrder(
                new ArrayList<>(Arrays.asList(
                        new Person("Jani",14),
                        new Person("Jani",24),
                        new Person("Jani",54),
                        new Person("Jani",34),
                        new Person("Jani",12),
                        new Person("Jani",75),
                        new Person("Jani",48)
                ))));
        System.out.println(vaccination.getVaccinationOrder(
                new ArrayList<>(Arrays.asList(
                        new Person("Jani",14),
                        new Person("Jani",24),
                        new Person("Jani",54),
                        new Person("Jani",34),
                        new Person("Jani",12),
                        new Person("Jani",75),
                        new Person("Jani",48)
                ))).poll());
    }
}
