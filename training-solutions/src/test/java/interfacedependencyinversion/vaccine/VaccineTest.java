package interfacedependencyinversion.vaccine;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class VaccineTest {
    List<Person> registrated;
    @BeforeEach
    void init(){
         registrated = new ArrayList<>(Arrays.asList(
                new Person("Jani",23,ChronicDisease.NO,Pregnancy.NO),
                new Person("Janka",30,ChronicDisease.NO,Pregnancy.YES),
                new Person("Erzsi",34,ChronicDisease.NO,Pregnancy.YES),
                new Person("Magdi",67,ChronicDisease.NO,Pregnancy.YES),
                new Person("Mari",23,ChronicDisease.YES,Pregnancy.YES),
                new Person("Robi",43,ChronicDisease.YES,Pregnancy.NO),
                new Person("Róbert",83,ChronicDisease.YES,Pregnancy.NO)
        ));
    }

    @Test
    void testGenerateVaccinationList() {
        Vaccine first = new FirstVaccine();
        Vaccine second= new SecondVaccine();
        first.generateVaccinationList(registrated);
        second.generateVaccinationList(registrated);

        assertEquals(7,first.getVaccinationList().size());
        assertEquals(1,second.getVaccinationList().size());
        for (Person p :
                first.getVaccinationList()) {
            System.out.println(p.getName());
        }
    }
}