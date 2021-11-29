package staticattrmath.dog;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VetTest {
    @Test
    void testAdd(){
        Vet vet = new Vet();
        vet.addDog(new Dog("Vadász",5,Species.GERMAN_SHEPHERD));
        vet.addDog(new Dog("Maszat",5,Species.GOLDEN_RETRIEVER));
        vet.addDog(new Dog("Sr. Anthony Newsfield",5,Species.LABRADOR));
        assertEquals(3,vet.getDogs().get(2).getCode());
    }
}