package isahasa.flotta;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FleetTest {

    Fleet fleet = new Fleet(List.of(new CargoShip(20,40),
            new Liner(50,70),
            new FerryBoat(20,40,30,50)));

    @Test
    void testLoadShip() {
        fleet.loadShip(50,50);
        assertEquals(10,fleet.getWaitingCargo());
        assertEquals(10,fleet.getWaitingPersons());
        fleet.loadShip(20,20);
        assertEquals(20,fleet.getWaitingCargo());
        assertEquals(20,fleet.getWaitingPersons());
    }
}