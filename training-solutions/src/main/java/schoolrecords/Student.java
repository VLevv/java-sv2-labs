package schoolrecords;

import java.util.ArrayList;
import java.util.List;

public class Student {
     private List<Mark> marks = new ArrayList<>();
     private String name;

    public Student(String name) {
        if(name.isEmpty()){
            throw new IllegalArgumentException("Student name must not be empty!");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void grading(Mark mark){
        if(mark==null){
            throw new NullPointerException("Mark must not be null!");
        }
        marks.add(mark);
    }

    public double calculateAverage(){
        if(marks.isEmpty()){
            return 0;
        }
        double sum=0;
        for (Mark m :
                marks) {
            sum+=m.getMarkType().getMark();
        }
        return ((double)((int)(100*(sum/marks.size()))))/100;
    }

    public double calculateSubjectAverage(Subject subject){
        if(marks.isEmpty()){
            return 0;
        }
        double sum=0;
        int c=0;
        for (Mark m :
                marks) {
            if(m.getSubject().getSubjectName().equals(subject.getSubjectName())){
            sum+=m.getMarkType().getMark();
            c++;
            }
        }
        if(c==0){
            return 0;
        }
        return sum/c;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(name);
        builder.append(" marks: ");
        boolean first = true;
        for (Mark m :
                marks) {
            if(first){
                first=false;
            }else {
                builder.append(", ");
            }
            builder.append(m.getSubject().getSubjectName());
            builder.append(": ");
            builder.append(m.getMarkType().toString());
        }
        return builder.toString();
    }
}
