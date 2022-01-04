package interfacestaticmethods.schoolchild;

public interface PrimarySchoolChild {
    static PrimarySchoolChild of(int age){
        if(age>=6&&age<=10){
            return new LowerClassSchoolChild();
        }else if (age>=11&&age<=14){
            return new UpperClassSchoolChild();
        }else {
            throw new IllegalArgumentException("Invalid age.");
        }
    }
}
