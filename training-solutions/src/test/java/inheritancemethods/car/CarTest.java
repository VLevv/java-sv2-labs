package inheritancemethods.car;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    @Test
    void testCars(){
        Car car = new Car(100.0/4,0,50);
        car.modifyFuelAmount(20);
        assertEquals(20,car.getFuel());
        car.modifyFuelAmount(31);
        assertEquals(50,car.getFuel());
        car.drive(100);
        assertEquals(46,car.getFuel());
        assertEquals(4,car.calculateRefillAmount());
        assertThrows(IllegalArgumentException.class,()->car.drive(10000));
    }

    @Test
    void testJeep(){
        Jeep jeep = new Jeep(100.0/4,0,60,20,0);
        jeep.modifyFuelAmount(50);
        assertEquals(50,jeep.getFuel());
        jeep.modifyFuelAmount(20);
        assertEquals(10,jeep.getExtraFuel());
        jeep.drive(100);
        assertEquals(6,jeep.getExtraFuel());
        jeep.drive(1000);
        assertEquals(26,jeep.getFuel());
        assertEquals(54,jeep.calculateRefillAmount());
    }
}