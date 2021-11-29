package algorithmssum.school;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SchoolTest {
    @Test
    void testSchool(){
        assertEquals(10,new School().getNumberOfStudents(Arrays.asList(3,4,3)));
    }
}
