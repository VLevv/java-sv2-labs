package inheritancemethods.employee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    @Test
    void testEmployee(){
        Employee employee = new Employee("Jani","Kozma utca",300000);
        Boss boss = new Boss("Főni","Pénztáros utca",300000,1);
        BigBoss bigBoss = new BigBoss("Fejes","Kassza utca",300000,1,10);
        assertEquals(300000,employee.getSalary());
        assertEquals(330000,boss.getSalary());
        assertEquals(330010,bigBoss.getSalary());
    }
}