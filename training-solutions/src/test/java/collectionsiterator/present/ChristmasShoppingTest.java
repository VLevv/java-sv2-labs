package collectionsiterator.present;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ChristmasShoppingTest {
@Test
    void testIterator(){
    ChristmasShopping shopping = new ChristmasShopping(new ArrayList<>(List.of(
            new ChristmasPresent("toy","BravoSix",1000),
            new ChristmasPresent("toy","BravoSix",2000),
            new ChristmasPresent("toy","BravoSix",3000),
            new ChristmasPresent("toy","BravoSix",4000),
            new ChristmasPresent("toy","BravoSix",5000),
            new ChristmasPresent("toy","BravoSix",6000),
            new ChristmasPresent("toy","BravoSix",7000),
            new ChristmasPresent("toy","BravoSix",8000)
    )));
    assertEquals(8,shopping.getPresents().size());
    shopping.removeTooExpensivePresent(6000);
    assertEquals(6,shopping.getPresents().size());
}
}