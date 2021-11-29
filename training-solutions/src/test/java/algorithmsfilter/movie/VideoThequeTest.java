package algorithmsfilter.movie;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VideoThequeTest {
    @Test
    void testVideo(){
        VideoTheque theque = new VideoTheque();
        theque.addMovie(new Movie("Titanic",Category.ROMANTIC,4));
        theque.addMovie(new Movie("The Boys",Category.ACTION,5));
        theque.addMovie(new Movie("Ironman",Category.ACTION,4));
        theque.addMovie(new Movie("Conjuring",Category.HORROR,3));
        assertEquals("The Boys",theque.getGoodMoviesWithCategoryGiven(Category.ACTION).get(0).getTitle());
        assertEquals(new ArrayList<>(),theque.getGoodMoviesWithCategoryGiven(Category.HORROR));
    }
}
