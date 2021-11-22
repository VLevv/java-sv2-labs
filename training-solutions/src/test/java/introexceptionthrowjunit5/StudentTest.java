package introexceptionthrowjunit5;

import introexceptionthrowjunit4.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class StudentTest {
    @Test
    void testList(){
        introexceptionthrowjunit4.Student student = new Student();
        student.addNote(1);
        assertEquals(1,student.getMarks().get(0));
    }

    @Test
    @org.junit.Test
    public void testListUsableOne(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                ()->new Student().addNote(7));
        assertEquals("Note must be between 1 and 5!",exception.getMessage());
    }
}
