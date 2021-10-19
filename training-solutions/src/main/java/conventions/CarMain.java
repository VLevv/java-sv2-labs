package conventions;

public class CarMain {
    public static void main(String[] args) {
        Car car =new Car("Szuzuki","V8",3,5);
        System.out.println(car.getCarType()+" "+car.getEngineType()+" "+car.getDoors()+" "+car.getPersons());
        car.setCarType("Subaru");
        car.setEngineType("V12");
        car.setDoors(5);
        car.setPersons(4);
        System.out.println(car.getCarType()+" "+car.getEngineType()+" "+car.getDoors()+" "+car.getPersons());
        car.addModelName("Impreza");
        System.out.println(car.getCarType()+" "+car.getEngineType()+" "+car.getDoors()+" "+car.getPersons());
    }
}
