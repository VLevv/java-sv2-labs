package introexceptionthrowjunit5;

import introexceptionthrowjunit4.Tank;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TankTest {
    @Test
    public void testGood(){
        introexceptionthrowjunit4.Tank tank = new Tank();
        tank.modifyAngle(20);
        assertEquals(20,tank.getAngle());
        tank.modifyAngle(-40);
        assertEquals(-20,tank.getAngle());
    }

    @Test
    public void testTank3(){
        IllegalArgumentException exception=assertThrows(IllegalArgumentException.class,
                ()->new Tank().modifyAngle(-100));
        assertEquals("Nem fordítható a cső!",exception.getMessage());
    }
}
