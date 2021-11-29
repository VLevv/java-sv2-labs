package methodoverloading.school;

import java.util.List;
import java.util.Locale;

public class ClassFiveA {
    private List<String> students;

    public ClassFiveA(List<String> students) {
        this.students = students;
    }

    public String getTodayReferringStudent(int number){
        return students.get(number-1);
    }

    public String getTodayReferringStudent(Number number){
        return students.get(number.getValues());
    }

    public String getTodayReferringStudent(String numberName){
        return students.get(Number.valueOf(numberName.toUpperCase()).getValues());
    }
}
