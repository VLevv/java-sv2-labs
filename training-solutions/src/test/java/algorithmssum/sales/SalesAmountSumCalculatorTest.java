package algorithmssum.sales;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SalesAmountSumCalculatorTest {
    @Test
    void testSales(){
        List<Salesperson> salespeople= Arrays.asList(
                new Salesperson("Jani",30000),
                new Salesperson("Pisti",20000),
                new Salesperson("Gabi",13000),
                new Salesperson("Józsi",50000));
        assertEquals(113000,new SalesAmountSumCalculator().sumSalesAmount(salespeople));
    }
}
