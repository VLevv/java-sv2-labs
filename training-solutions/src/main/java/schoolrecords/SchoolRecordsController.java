package schoolrecords;

import java.util.*;

public class SchoolRecordsController {

    private List<Subject> subjects = new ArrayList<>();
    private List<Tutor> tutors = new ArrayList<>();
    private ClassRecords classRecords;

    public static void main(String[] args) {
        SchoolRecordsController controller = new SchoolRecordsController();
        controller.run();
    }

    public void run(){
        Scanner scanner = new Scanner(System.in);
        SchoolRecordsController controller = new SchoolRecordsController();
        controller.initSchool();
        int num=0;
        while(num!=11){
            System.out.println("1. Diákok nevének listázása\n" +
                    "2. Diák név alapján keresése\n" +
                    "3. Diák létrehozása\n" +
                    "4. Diák név alapján törlése\n" +
                    "5. Diák feleltetése\n" +
                    "6. Osztályátlag kiszámolása\n" +
                    "7. Tantárgyi átlag kiszámolása\n" +
                    "8. Diákok átlagának megjelenítése\n" +
                    "9. Diák átlagának kiírása\n" +
                    "10. Diák tantárgyhoz tartozó átlagának kiírása\n" +
                    "11. Kilépés");
            num=scanner.nextInt();
            scanner.nextLine();
            switch (num){
                case 1:
                    System.out.println(controller.classRecords.listStudentNames());
                    break;
                case 2:
                    System.out.println("Adja meg a nevet!");
                    System.out.println(controller.classRecords.findStudentByName(scanner.nextLine()));
                    break;
                case 3:
                    System.out.println("Adja meg a nevet!");
                    controller.classRecords.addStudent(new Student(scanner.nextLine()));
                    break;
                case 4:
                    System.out.println("Adja meg a nevet!");
                    controller.classRecords.removeStudent(new Student(scanner.nextLine()));
                    break;
                case 5:
                    controller.classRecords.repetition().grading(new Mark(MarkType.valueOf(scanner.nextLine()),new Subject(scanner.nextLine()),controller.tutors.get(scanner.nextInt())));
                    break;
                case 6:
                    System.out.println(controller.classRecords.calculateClassAverage());
                    break;
                case 7:
                    System.out.println("Adja meg a tantárgyat!");
                    System.out.println(controller.classRecords.calculateClassAverageBySubject(new Subject(scanner.nextLine())));
                    break;
                case 8:
                    System.out.println(controller.classRecords.listStudyResults());
                    break;
                case 9:
                    System.out.println("Adja meg a nevet!");
                    System.out.println(controller.classRecords.findStudentByName(scanner.nextLine()).calculateAverage());
                    break;
                case 10:
                    System.out.println("Adja meg a nevet majd a tantárgyat!");
                    System.out.println(controller.classRecords.findStudentByName(scanner.nextLine()).calculateSubjectAverage(new Subject(scanner.nextLine())));
                    break;
            }
        }
    }


    public void initSchool(){
        Tutor tutor = new Tutor("Nagy Csilla",
                Arrays.asList(new Subject("földrajz"),
                        new Subject("matematika"),
                        new Subject("biológia"),
                        new Subject("zene"),
                        new Subject("fizika"),
                        new Subject("kémia")));
        classRecords = new ClassRecords("Fourth Grade A", new Random(5));
        Student firstStudent = new Student("Kovács Rita");
        Student secondStudent = new Student("Nagy Béla");
        Student thirdStudent = new Student("Varga Márton");
        firstStudent.grading(new Mark(MarkType.A, new Subject("földrajz"), tutor));
        firstStudent.grading(new Mark(MarkType.C, new Subject("matematika"), tutor));
        firstStudent.grading(new Mark(MarkType.D, new Subject("földrajz"), tutor));
        secondStudent.grading(new Mark(MarkType.A, new Subject("biológia"), tutor));
        secondStudent.grading(new Mark(MarkType.C, new Subject("matematika"), tutor));
        secondStudent.grading(new Mark(MarkType.D, new Subject("zene"), tutor));
        thirdStudent.grading(new Mark(MarkType.A, new Subject("fizika"), tutor));
        thirdStudent.grading(new Mark(MarkType.C, new Subject("kémia"), tutor));
        thirdStudent.grading(new Mark(MarkType.D, new Subject("földrajz"), tutor));
        classRecords.addStudent(firstStudent);
        classRecords.addStudent(secondStudent);
        classRecords.addStudent(thirdStudent);
        tutors.add(tutor);
        subjects.add(new Subject("matematika"));
        subjects.add(new Subject("biológia"));
        subjects.add(new Subject("zene"));
        subjects.add(new Subject("fizika"));
        subjects.add(new Subject("kémia"));
    }
}
