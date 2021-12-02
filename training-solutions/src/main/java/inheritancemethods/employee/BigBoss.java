package inheritancemethods.employee;

public class BigBoss extends Boss{
    private double bonus;

    public BigBoss(String name, String address, double salary, int numberOfEmployees, double bonus) {
        super(name, address, salary, numberOfEmployees);
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        return super.getSalary()+bonus;
    }

    @Override
    public int getNumberOfEmployees() {
        return super.getNumberOfEmployees()+1;
    }

    public double getBonus() {
        return bonus;
    }
}
