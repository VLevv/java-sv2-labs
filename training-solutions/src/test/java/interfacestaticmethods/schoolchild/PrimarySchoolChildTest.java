package interfacestaticmethods.schoolchild;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimarySchoolChildTest {

    @Test
    void testOf() {
        assertEquals(LowerClassSchoolChild.class,PrimarySchoolChild.of(7).getClass());
        assertEquals(UpperClassSchoolChild.class,PrimarySchoolChild.of(12).getClass());
        assertThrows(IllegalArgumentException.class,()->PrimarySchoolChild.of(16));
    }
}