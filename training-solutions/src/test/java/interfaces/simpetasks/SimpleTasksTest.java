package interfaces.simpetasks;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SimpleTasksTest {

    @Test
    void testRun() {
        SimpleTasks tasks = new SimpleTasks(Arrays.asList("run","eat","sleep"));
        assertEquals(3,tasks.getTasks().size());
        tasks.run();
        assertEquals(0,tasks.getTasks().size());
    }
}