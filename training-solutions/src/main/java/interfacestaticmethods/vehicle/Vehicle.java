package interfacestaticmethods.vehicle;

public interface Vehicle {
    static Vehicle of(int numberOfWheels){
        if (numberOfWheels==2){
            return new Bicycle();
        }else if (numberOfWheels==4){
            return new Car("Audi");
        }else {
            throw new IllegalArgumentException("Invalid input.");
        }
    }
}
