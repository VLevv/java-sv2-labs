package stringbasic;

import java.util.ArrayList;
import java.util.List;

public class University {
    List<Student> students = new ArrayList<>();

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public boolean areEqual(Student student,Student otherStudent){
        if(student.getNeptun().equals(otherStudent.getNeptun())&&student.getOktAz().equals(otherStudent.getOktAz())){
            return true;
        }
        return false;
    }
}
