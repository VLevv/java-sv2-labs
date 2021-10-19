package linebreaker;

public class Car {
    public String getBrandAndTypeInSeparateLines(String brand,String type){
        return (brand+"\n"+type);
    }

    public static void main(String[] args) {
        Car car =new Car();
        System.out.print(car.getBrandAndTypeInSeparateLines("Suzuki","Swift"));
    }
}
