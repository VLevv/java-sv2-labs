package algoritmsmax.sales;

import algorithmsmax.sales.Sales;
import algorithmsmax.sales.Salesperson;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SalesTest {
    List<Salesperson> salespeople;
    Sales sales = new Sales();
    @BeforeEach
    void init() {
         salespeople= Arrays.asList(
                new Salesperson("Jani", 3000, 2000),
                new Salesperson("Peti", 3000, 1000),
                new Salesperson("Dóri", 1000, 2000),
                new Salesperson("Zsolt", 4000, 2500),
                new Salesperson("Gabi", 3000, 5000)
        );
    }

    @Test
    void testMaxSales(){
        assertEquals(salespeople.get(3),sales.selectSalesPersonWithMaxSalesAmount(salespeople));
    }

    @Test
    void testFurthestAbove(){
        assertEquals(salespeople.get(1),sales.selectSalesPersonWithFurthestAboveTarget(salespeople));
    }

    @Test
    void testFurthestBelow(){
        assertEquals(salespeople.get(4),sales.selectSalesPersonWithFurthestBelowTarget(salespeople));
    }
}
