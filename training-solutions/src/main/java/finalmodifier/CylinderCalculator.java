package finalmodifier;

public class CylinderCalculator {
    public double calculateVolume(double r,double h){
        return h*r*r*CircleCalculator.PI;
    }

    public double calculateSurfaceArea(double r,double h){
        return h*2*r*CircleCalculator.PI;
    }
}
