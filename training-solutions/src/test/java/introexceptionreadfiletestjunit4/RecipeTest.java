package introexceptionreadfiletestjunit4;

import org.junit.Test;

import java.nio.file.Paths;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RecipeTest {
    @Test
    public void testWorking(){
        Recipe recipe = new Recipe();
        recipe.addIngredients(Paths.get("src/main/java/introexceptionreadfiletestjunit4/recipe.txt"));
        assertEquals(Arrays.asList("liszt", "margarin", "kristálycukor", "tojás", "citrom", "sütőpor", "vanillincukor", "tejföl", "alma", "fahéj"),recipe.getIngredients());
    }

    @Test
    public void testThrow(){
        assertThrows(IllegalStateException.class,
                ()->new Recipe().addIngredients(Paths.get("src/main/java/introexceptionreadfiletestjunit4/recipa.txt")));
    }
}
