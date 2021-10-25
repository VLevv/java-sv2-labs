package intromethods.employee;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee =new Employee("Laci", 2014,200000);
        employee.raiseSalary(200000);
        System.out.println(employee);
    }
}
