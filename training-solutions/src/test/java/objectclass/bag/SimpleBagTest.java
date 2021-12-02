package objectclass.bag;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleBagTest {
    @Test
    void testBag(){
        SimpleBag bag = new SimpleBag();
        bag.putItem(new Book("Jani","Az élet titka"));
        bag.putItem(new Beer("Soproni",300));
        bag.putItem(new Book("Jónás","Minden"));
        bag.putItem(new Beer("Borsodi",300));
        bag.putItem(new Beer("Köbi",300));
        bag.putItem(new Book("Magdi","A lépcsőkről"));
        bag.putItem(new Beer("Stalopramen",300));
        bag.putItem(new Beer("Kézműves",600));
        assertFalse(bag.isEmpty());
        bag.beforeFirst();
        bag.next();
        bag.next();
        bag.next();
        bag.next();
        assertEquals(4,bag.getCursor());
        bag.next();
        bag.next();
        bag.next();
        assertFalse(bag.hasNext());
        bag.beforeFirst();
        assertTrue(bag.contains(new Beer("Köbi",300)));
    }
}