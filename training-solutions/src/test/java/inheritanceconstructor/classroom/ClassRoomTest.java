package inheritanceconstructor.classroom;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClassRoomTest {

    @Test
    void testIsSuitable() {
        ClassRoom classRoom = new ClassRoom("First floor",30,Facility.CHALKBOARD);
        assertTrue(classRoom.isSuitable(new Course(29,Facility.CHALKBOARD)));
        assertFalse(classRoom.isSuitable(new Course(31,Facility.CHALKBOARD)));
        assertFalse(classRoom.isSuitable(new Course(21,Facility.COMPUTERS)));
    }
}