package interfacerules.bill;

import org.junit.jupiter.api.Test;

import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class SimpleBillWriterTest {

    @Test
    void testWriteBill() {
        SimpleBillWriter writer = new SimpleBillWriter();
        Bill bill = new Bill();
        System.out.println(writer.writeBill(bill.readBillItemsFromFile(Paths.get("src/main/resources/billitems.txt"))));
        }
}