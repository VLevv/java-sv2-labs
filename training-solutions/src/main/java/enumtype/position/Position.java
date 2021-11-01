package enumtype.position;

public enum Position {
    BOSS(1000000,"all"),EMPLOYEE(100000,"meh");

    private final int salary;
    private final String benefit;

    Position(int salary, String benefit) {
        this.salary = salary;
        this.benefit = benefit;
    }

    public int getSalary() {
        return salary;
    }

    public String getBenefit() {
        return benefit;
    }
}
