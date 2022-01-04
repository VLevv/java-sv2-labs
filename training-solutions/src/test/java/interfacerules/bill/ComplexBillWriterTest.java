package interfacerules.bill;

import org.junit.jupiter.api.Test;

import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class ComplexBillWriterTest {

    @Test
    void testWriteBill() {
        ComplexBillWriter writer = new ComplexBillWriter();
        Bill bill = new Bill();
        System.out.println(writer.writeBill(bill.readBillItemsFromFile(Paths.get("src/main/resources/billitems.txt"))));
    }
}