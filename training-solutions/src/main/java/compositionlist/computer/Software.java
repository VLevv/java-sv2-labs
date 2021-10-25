package compositionlist.computer;

public class Software {
    private String name;
    private double numberOfVersions;

    public Software(String name, double numberOfVersions) {
        this.name = name;
        this.numberOfVersions = numberOfVersions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNumberOfVersions() {
        return numberOfVersions;
    }

    public void setNumberOfVersions(double numberOfVersions) {
        this.numberOfVersions = numberOfVersions;
    }

    @Override
    public String toString() {
        return "Software{" +
                "name='" + name + '\'' +
                ", numberOfVersions=" + numberOfVersions +
                '}';
    }
}
