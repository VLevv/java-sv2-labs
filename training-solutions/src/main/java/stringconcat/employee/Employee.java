package stringconcat.employee;

public class Employee {
    private String name;
    private String job;
    private int pay;

    public Employee(String name, String job, int pay) {
        this.name = name;
        this.job = job;
        this.pay = pay;
    }

    @Override
    public String toString() {
        return name + " - " + job + " - "+ pay + " Ft";
    }
}
