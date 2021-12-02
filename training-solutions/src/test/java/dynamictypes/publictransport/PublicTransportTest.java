package dynamictypes.publictransport;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PublicTransportTest {
    @Test
    void testTransport(){
        PublicVehicle bus= new Bus(32,20.12,"Ikarusz");
        PublicVehicle tram= new Tram(45,23.34,3);
        PublicVehicle metro= new Metro(2,32.43,13);
        PublicTransport transport =new PublicTransport();
        transport.addVehicle(bus).addVehicle(tram).addVehicle(metro);
        assertEquals(3,transport.getVehicles().size());
    }
}