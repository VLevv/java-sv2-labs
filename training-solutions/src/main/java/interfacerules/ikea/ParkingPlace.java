package interfacerules.ikea;

public class ParkingPlace implements Width,Length{
    @Override
    public double getLength() {
        return 2.2;
    }

    @Override
    public double getWidth() {
        return 5;
    }
}
