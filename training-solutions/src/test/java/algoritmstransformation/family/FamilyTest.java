package algoritmstransformation.family;

import algorithmstransformation.family.Family;
import algorithmstransformation.family.FamilyMember;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FamilyTest {
    @Test
    void testFamily(){
        Family family = new Family(Arrays.asList(
                new FamilyMember("Esti Kornél",23),
                new FamilyMember("Esti Jakab",33),
                new FamilyMember("Esti Mihály",13),
                new FamilyMember("Esti Gyula",43),
                new FamilyMember("Esti Péter Kornél",26)
        ));
        assertEquals(2,family.getAgesOfFamilyMembersWithNameGiven("Kornél").size());
    }
}
