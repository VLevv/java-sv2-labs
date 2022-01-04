package interfacestaticmethods.vehicle;

public class Car implements Vehicle{
    private int numberOfWheels;
    private String brand;

    public Car(String brand) {
        this.brand = brand;
        numberOfWheels=4;
    }

    public Car(int numberOfWheels, String brand) {
        this.numberOfWheels = numberOfWheels;
        this.brand = brand;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public String getBrand() {
        return brand;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
