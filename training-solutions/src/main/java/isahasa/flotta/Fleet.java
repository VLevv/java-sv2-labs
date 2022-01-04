package isahasa.flotta;

import java.util.ArrayList;
import java.util.List;

public class Fleet {
    private List<Ship> ships =new ArrayList<>();
    private int waitingPersons;
    private int waitingCargo;

    public Fleet(List<Ship> ships) {
        this.ships = ships;
    }

    public List<Ship> getShips() {
        return ships;
    }

    public int getWaitingPersons() {
        return waitingPersons;
    }

    public int getWaitingCargo() {
        return waitingCargo;
    }

    public void loadShip(int passengers,int cargoWeight){
        int i =0;
        do{
        if(ships.get(i) instanceof Liner){
            waitingPersons=((Liner) ships.get(i)).loadPassenger(passengers);
            passengers=waitingPersons;
        }
        if(ships.get(i) instanceof CargoShip){
            waitingCargo=((CargoShip) ships.get(i)).loadCargo(cargoWeight);
            cargoWeight=waitingCargo;
        }
        if(ships.get(i) instanceof FerryBoat){
            waitingCargo=((FerryBoat) ships.get(i)).loadCargo(cargoWeight);
            waitingPersons= ((FerryBoat) ships.get(i)).loadPassenger(passengers);
            passengers=waitingPersons;
            cargoWeight=waitingCargo;
        }
        ++i;
        }while((waitingPersons!=0||waitingCargo!=0)&&i<ships.size());
    }
}
