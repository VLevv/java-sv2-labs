package introdate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class EmployeeTest {
    public static void main(String[] args) {
        LocalDate birth = LocalDate.of(1970, Month.SEPTEMBER,12);
        LocalDateTime startOfEmploy = LocalDateTime.now();
        Employee employee =new Employee("Kiss Jani",birth,startOfEmploy);
        System.out.println(employee.getBeginEmployment());
        System.out.println(employee.getDateOfBirth());
        System.out.println(employee.getName());
    }
}
