package methodvarargs.examstats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExamStatsTest {
    @Test
    void testGrades(){
        ExamStats stats = new ExamStats(100);
        assertEquals(2,stats.getNumberOfTopGrades(80,91,23,83));
        assertTrue(stats.hasAnyFailed(80,92,23,84));
    }
}