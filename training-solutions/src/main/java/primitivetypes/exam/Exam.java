package primitivetypes.exam;

import java.util.ArrayList;
import java.util.List;

public class Exam {
    List<Person> people=new ArrayList<>();

    public List<Person> getPeople() {
        return people;
    }

    public void addPerson(Person person){
        people.add(person);
    }
}
