package looptypesmodify;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LanguageSchool {
    public static void main(String[] args) {
        Student sanyi = new Student("Kiss Sanyi");
        Student lajos = new Student("Marosvölgyi lajos");
        Student feri= new Student("Barcikai Frei");
        List<Student> students = new ArrayList<>(Arrays.asList(sanyi, lajos, feri));
        List<Student> end=new ArrayList<>();
        students.get(1).setActive(false);
        students.get(2).setActive(false);
        for(Student stu:students){
            if(stu.isActive()==false){
                end.add(stu);
            }
        }
        students.removeAll(end);
        System.out.println(students.size());
    }
}
