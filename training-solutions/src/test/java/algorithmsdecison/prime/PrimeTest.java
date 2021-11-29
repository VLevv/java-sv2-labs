package algorithmsdecison.prime;

import algorithmsdecision.prime.Prime;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PrimeTest {
    @Test
    void testPrime(){
        assertTrue(new Prime().isPrime(3));
        assertFalse(new Prime().isPrime(4));
    }
}
