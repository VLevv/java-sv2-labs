package interfacestaticmethods.vehicle;

public class Bicycle implements Vehicle{
    private int numberOfWheels;

    public Bicycle() {
        numberOfWheels = 2;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }
}
