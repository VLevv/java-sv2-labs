package enumtype.solarsystem;

public enum SolarSystem {
    MERKÚR(0),VÉNUSZ(0),FÖLD(1),MARS(2),JUPITER(63),SATURNUSZ(62),URÁNUSZ(27),NEPTUNUSZ(13);

    private final int value;

    SolarSystem(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
