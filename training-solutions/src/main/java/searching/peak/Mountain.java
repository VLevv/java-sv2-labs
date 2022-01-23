package searching.peak;

import java.util.Arrays;

public class Mountain {
    private double[] peakHeights;

    public Mountain(double[] peakHeights) {
        this.peakHeights = peakHeights;
    }

    public double[] getPeakHeights() {
        return peakHeights;
    }

    boolean searchPeak(Peak peak){
        if(Arrays.binarySearch(peakHeights,peak.getPeakHeight())>0){
            return true;
        }
        return false;
    }
}
