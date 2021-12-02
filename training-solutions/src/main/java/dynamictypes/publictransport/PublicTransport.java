package dynamictypes.publictransport;

import java.util.ArrayList;
import java.util.List;

public class PublicTransport {
    private List<PublicVehicle> vehicles=new ArrayList<>();

    public List<PublicVehicle> getVehicles() {
        return vehicles;
    }

    public PublicTransport addVehicle(PublicVehicle vehicle){
        vehicles.add(vehicle);
        return this;
    }
}
