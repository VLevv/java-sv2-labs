package introexceptionthrowjunit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StudentTest {
    @Test
    public void testList(){
        Student student = new Student();
        student.addNote(1);
        assertThat(student.getMarks().get(0),equalTo(1));
    }

  @Test(expected = IllegalArgumentException.class)
  public void testListThrow1(){
        new Student().addNote(7);
  }

    @Rule
    public ExpectedException exception = ExpectedException.none();
    @Test
      public void testListThrow2(){
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("Note must be between 1 and 5!");
        new Student().addNote(7);
    }


    @Test
    public void testListUsableOne(){
     IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
             ()->new Student().addNote(7));
     assertEquals("Note must be between 1 and 5!",exception.getMessage());
    }
}
