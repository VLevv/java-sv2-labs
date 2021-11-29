package methodparam.marriage;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MarriageTest {
    @Test
    void testMarriage(){
        Man man = new Man("Kiss Jakab", new ArrayList<>(Arrays.asList(
                new RegisterDate("születés", LocalDate.of(1970,04,05)),
                new RegisterDate("első levegő vétel", LocalDate.of(1970,04,05))
        )));

        Woman woman = new Woman("Marosi Eszter",new ArrayList<>( Arrays.asList(
                new RegisterDate("születés", LocalDate.of(1970,04,05)),
                new RegisterDate("első levegő vétel", LocalDate.of(1970,04,05))
        )));
        new Marriage().getMarried(woman,man);
        assertEquals("Kiss Eszter",woman.getName());
        assertEquals(LocalDate.now(),man.getRegisterDates().get(man.getRegisterDates().size()-1).getDate());
    }

}