package algorithmsfilter.prefix;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrefixTest {
    @Test
    void testPrefix(){
        List<String> words= Arrays.asList(
                "alma",
                "almáspite",
                "alamizsna",
                "banán",
                "nád"
        );
        assertEquals(Arrays.asList("alma","almáspite","alamizsna"),new Prefix().getWordsStartWith(words,"al"));

    }
}
