package interfacerules.ikea;

public class Equator implements Name,Length{
    private static final String NAME="Egyenlítő";
    private static final double LENGTH=10;

    @Override
    public double getLength() {
        return LENGTH;
    }

    @Override
    public String getName() {
        return NAME;
    }
}
