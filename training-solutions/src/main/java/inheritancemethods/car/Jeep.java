package inheritancemethods.car;

public class Jeep extends Car{
    private double extraCapacity;
    private double extraFuel;

    public Jeep(double fuelRate, double fuel, double tankCapacity, double extraCapacity, double extraFuel) {
        super(fuelRate, fuel, tankCapacity);
        this.extraCapacity = extraCapacity;
        this.extraFuel = extraFuel;
    }

    @Override
    public void modifyFuelAmount(double fuel) {
        if(this.fuel+fuel<tankCapacity){
            super.modifyFuelAmount(fuel);
        }else {
            fuel=fuel-(tankCapacity-this.fuel);
            this.fuel=tankCapacity;
            if(extraFuel+fuel<extraCapacity){
                extraFuel+=fuel;
            }else {
                this.fuel=tankCapacity;
                extraFuel=extraCapacity;
            }
        }
    }

    @Override
    public void drive(int km) {
        if(0<extraFuel-km/fuelRate){
            extraFuel-=km/fuelRate;
        }else {
            int remaining=(int)((km/fuelRate-extraFuel)*fuelRate);
            extraFuel=0;
            super.drive(remaining);
        }
    }

    @Override
    public double calculateRefillAmount() {
        if(fuel<tankCapacity){
            return (tankCapacity-fuel)+extraCapacity;
        }else {
            return extraCapacity-extraFuel;
        }
    }

    public double getExtraCapacity() {
        return extraCapacity;
    }

    public double getExtraFuel() {
        return extraFuel;
    }
}
