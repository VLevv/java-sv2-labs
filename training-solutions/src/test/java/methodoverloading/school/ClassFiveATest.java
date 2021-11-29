package methodoverloading.school;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ClassFiveATest {
    @Test
    void testReferring(){
        ClassFiveA classFiveA = new ClassFiveA(Arrays.asList("Jani","Peti","Gabi"));
        assertEquals("Jani",classFiveA.getTodayReferringStudent(1));
        assertEquals("Peti",classFiveA.getTodayReferringStudent(Number.TWO));
        assertEquals("Gabi",classFiveA.getTodayReferringStudent("three"));
    }
}