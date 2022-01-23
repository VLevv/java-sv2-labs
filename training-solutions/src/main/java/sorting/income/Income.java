package sorting.income;

import java.util.Arrays;

public class Income {
    private int[] yearlyIncome;

    public Income(int[] yearlyIncome) {
        this.yearlyIncome = yearlyIncome;
    }

    public int[] getYearlyIncome() {
        return yearlyIncome;
    }

    public int getHighestIncome(){
        Arrays.sort(yearlyIncome);
        return yearlyIncome[yearlyIncome.length-1];
    }
}
