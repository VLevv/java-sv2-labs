package algoritmstransformation.student;

import algorithmstransformation.student.Person;
import algorithmstransformation.student.PrimarySchool;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrimarySchoolTest {
    @Test
    void testSchool(){
        PrimarySchool school = new PrimarySchool(Arrays.asList(
                new Person("Jani",13,"Bajcsi út"),
                new Person("Peti",23,"Bajcsi út"),
                new Person("Dani",43,"Bajcsi út"),
                new Person("Gabi",11,"Bajcsi út"),
                new Person("Csabi",14,"Bajcsi út")
        ));
        assertEquals(3,school.getStudents().size());
    }
}
