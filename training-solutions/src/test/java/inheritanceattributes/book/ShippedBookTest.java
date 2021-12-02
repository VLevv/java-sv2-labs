package inheritanceattributes.book;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShippedBookTest {
    @Test
    void testBook(){
        Book book=new ShippedBook("Gyűrűk ura",3000,1200);
        assertEquals("Gyűrűk ura: 3000 Ft, postaköltség: 1200 Ft",book.toString());
    }

}