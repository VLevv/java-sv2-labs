package searching.peak;

public class Peak {
    private String peakName;
    private double peakHeight;

    public Peak(String peakName, double peakHeight) {
        this.peakName = peakName;
        this.peakHeight = peakHeight;
    }

    public String getPeakName() {
        return peakName;
    }

    public double getPeakHeight() {
        return peakHeight;
    }
}
