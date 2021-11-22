package introexceptionthrowjunit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TankTest {
    @Test
    public void testGood(){
        Tank tank = new Tank();
        tank.modifyAngle(20);
        assertThat(tank.getAngle(),equalTo(20));
        tank.modifyAngle(-40);
        assertThat(tank.getAngle(),equalTo(-20));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTank1(){
        new Tank().modifyAngle(100);
        new Tank().modifyAngle(-200);
    }

    @Rule
    public ExpectedException exception=ExpectedException.none();

    @Test
    public void testTank2(){
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("Nem fordítható a cső!");
        new Tank().modifyAngle(100);
    }

    @Test
    public void testTank3(){
        IllegalArgumentException exception=assertThrows(IllegalArgumentException.class,
                ()->new Tank().modifyAngle(-100));
        assertEquals("Nem fordítható a cső!",exception.getMessage());
    }
}
