package finalmodifier;

public class PiMain {
    public static void main(String[] args) {
        System.out.println(CircleCalculator.PI);
        System.out.println((new CircleCalculator().calculateArea(4.5)));
        System.out.println((new CircleCalculator().calculatePerimeter(4.5)));
        System.out.println((new CylinderCalculator().calculateSurfaceArea(4.5,4.5)));
        System.out.println((new CylinderCalculator().calculateVolume(4.5,4.5)));
        System.out.println((new CylinderCalculatorBasedOnCircle().calculateVolume(4.5,4.5)));
        System.out.println((new CylinderCalculatorBasedOnCircle().calculateSurfaceArea(4.5,4.5)));
    }
}
