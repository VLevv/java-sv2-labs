package stringbasic;

public class UniversityMain {
    public static void main(String[] args) {
        Person person = new Person("Jakab","jk@asd.com","123321123321","12314235234563-123123412342","068040774");
        Student student = new Student(person,"batman","74562765734");
        University university = new University();
        university.addStudent(student);
        university.addStudent(student);
        System.out.println(university.areEqual(university.getStudents().get(0),university.getStudents().get(1) ));
    }
}
