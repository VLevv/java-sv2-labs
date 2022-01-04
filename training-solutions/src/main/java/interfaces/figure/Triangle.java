package interfaces.figure;

public class Triangle implements Area{
    private double lengthOfSide;
    private double height;

    public Triangle(double lengthOfSide) {
        this.lengthOfSide = lengthOfSide;
    }

    public double getLengthOfSide() {
        return lengthOfSide;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return height*lengthOfSide/2;
    }
}
