package controladvanced.labels;

import controladvaced.labels.Labels;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LabelsTest {
    @Test
    void testLabels(){
        Labels labels = new Labels();
        int[][] test = labels.getTableOfNumbers(4);
        assertEquals(8,test[3][3]);
    }
}
