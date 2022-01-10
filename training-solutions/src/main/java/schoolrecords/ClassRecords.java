package schoolrecords;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ClassRecords {
    private String className;
    private Random random;
    private List<Student> students = new ArrayList<>();

    public ClassRecords(String className, Random random) {
        if(isEmpty(className)){
            throw new IllegalArgumentException("Missing name");
        }
        this.className = className;
        this.random = random;
    }

    public String getClassName() {
        return className;
    }

    public boolean addStudent(Student student){
        for (Student s :
                students) {
            if(s.getName().equals(student.getName())){
                return false;
            }
        }
        students.add(student);
        return true;
    }

    public boolean removeStudent(Student student){
        for (Student s :
                students) {
            if(s.getName().equals((student.getName()))){
                students.remove(student);
                return true;
            }
        }
        return false;
    }

    public double calculateClassAverage(){
        if(students.size()==0){
            throw new ArithmeticException("No student in the class, average calculation aborted!");
        }
        double sum=0;
        for (Student s :
                students) {
            sum+=s.calculateAverage();
        }
        if(sum==0){
            throw new ArithmeticException("No marks present, average calculation aborted!");
        }
        return sum/students.size();
    }

    public double calculateClassAverageBySubject(Subject subject){
        double sum=0;
        int c=0;
        for (Student s :
                students) {
            if(s.calculateSubjectAverage(subject)!=0){
            sum+=s.calculateSubjectAverage(subject);
            c++;
            }
        }
        return ((double)(int)(100*(sum/c)))/100;
    }

    public Student findStudentByName(String name){
        if(students.size()==0){
            throw new IllegalStateException("No students to search!");
        }
        if(isEmpty(name)){
            throw new IllegalArgumentException("Student name must not be empty!");
        }
        for (Student s :
                students) {
            if(s.getName().equals(name)){
                return s;
            }
        }
        throw new IllegalArgumentException("Student by this name cannot be found! "+name);
    }

    public Student repetition(){
        if(students.size()==0){
            throw new IllegalStateException("No students to select for repetition!");
        }
        return students.get(random.nextInt(students.size()));
    }

    public List<StudyResultByName> listStudyResults(){
        List<StudyResultByName> result = new ArrayList<>();
        for (Student s:
                students
             ) {
            result.add(new StudyResultByName(s.getName(),s.calculateAverage()));
        }
        return result;
    }

    public String listStudentNames(){
        StringBuilder builder = new StringBuilder();
        boolean first = true;
        for (Student s:
             students) {
            if(first){
                first=false;
            }else {
                builder.append(", ");
            }
            builder.append(s.getName());
        }
        return builder.toString();
    }

    private boolean isEmpty(String str){
        if(str.equals(null)||str.equals("")){
            return true;
        }else {
            return false;
        }
    }
}
