package schoolrecords;

import java.util.List;

public class Tutor {
    private String name;
    private List<Subject> taughtSubjects;

    public Tutor(String name, List<Subject> subjects) {
        this.name = name;
        this.taughtSubjects = subjects;
    }

    public String getName() {
        return name;
    }

    public boolean tutorTeachingSubject(Subject subject){
        for (Subject s :
                taughtSubjects) {
            if(s.getSubjectName().equals(subject.getSubjectName())){
                return true;
            }
        }
        return false;
    }
}
