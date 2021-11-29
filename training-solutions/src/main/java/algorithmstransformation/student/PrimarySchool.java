package algorithmstransformation.student;

import java.util.ArrayList;
import java.util.List;

public class PrimarySchool {
    private List<Person> persons= new ArrayList<>();

    public List<Person> getPersons() {
        return persons;
    }

    public PrimarySchool(List<Person> persons) {
        this.persons = persons;
    }

    public void addPerson(Person person){
        persons.add(person);
    }

    public List<Student> getStudents(){
        List<Student> results = new ArrayList<>();
        for (Person p :
                persons) {
            if (p.getAge() < 16) {
                results.add(new Student(p.getName(),p.getAddress()));
            }
        }
        return results;
    }
}
