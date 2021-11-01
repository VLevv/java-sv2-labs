package primitivetypes.exam;

import java.time.LocalDate;
import java.util.Scanner;

public class ExamRegistration {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Adja meg az adatokat!");
        Exam exam = new Exam();
        exam.addPerson(new Person(scanner.nextLine(), LocalDate.parse(scanner.nextLine()),Integer.parseInt(scanner.nextLine()),Double.parseDouble(scanner.nextLine())));
        System.out.println(exam.getPeople());
    }
}
