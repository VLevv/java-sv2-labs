package statemachine.typewriter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TypeWriterStateTest {

    @Test
    void testState() {
        assertEquals(TypeWriterState.OFF,TypeWriterState.ON.state());
    }
}