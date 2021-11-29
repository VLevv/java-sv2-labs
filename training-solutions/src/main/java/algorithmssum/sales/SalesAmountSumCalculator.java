package algorithmssum.sales;

import java.util.List;

public class SalesAmountSumCalculator {
    public int sumSalesAmount(List<Salesperson> salespeople){
        int sum=0;
        for (Salesperson s :
                salespeople) {
            sum+=s.getAmount();
        }
        return sum;
    }
}
