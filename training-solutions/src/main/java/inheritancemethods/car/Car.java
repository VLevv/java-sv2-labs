package inheritancemethods.car;

public class Car {
    protected double fuelRate;
    protected double fuel;
    protected double tankCapacity;

    public Car(double fuelRate, double fuel, double tankCapacity) {
        this.fuelRate = fuelRate;
        this.fuel = fuel;
        this.tankCapacity = tankCapacity;
    }

    public void modifyFuelAmount(double fuel){
        if(this.fuel+fuel<=tankCapacity){
            this.fuel+=fuel;
        }else {
        this.fuel=tankCapacity;
        }
    }

    public void drive(int km){
        if(0<fuel-km/fuelRate){
            fuel-=km/fuelRate;
        }
        else {
            throw new IllegalArgumentException("Not enough fuel");
        }
    }

    public double calculateRefillAmount(){
        return tankCapacity-fuel;
    }

    public double getFuelRate() {
        return fuelRate;
    }

    public double getFuel() {
        return fuel;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }
}
