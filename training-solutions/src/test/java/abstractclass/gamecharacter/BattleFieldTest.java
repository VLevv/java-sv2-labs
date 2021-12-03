package abstractclass.gamecharacter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BattleFieldTest {

    @Test
    void testFight() {
        Character warrior = new AxeWarrior(new Point(3,3));
        Character archer = new Archer(new Point(14,4));
        System.out.println(new BattleField().fight(warrior,archer));
    }
}