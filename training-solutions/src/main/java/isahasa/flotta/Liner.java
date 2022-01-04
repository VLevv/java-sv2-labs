package isahasa.flotta;

public class Liner implements Ship,CanCarryPassengers{
    private CanCarryPassengers passengers;

    public Liner(int passengers,int maxPassengers) {
        this.passengers=new CanCarryPassengersBehaviour(passengers,maxPassengers);
    }

    @Override
    public int loadPassenger(int passengers) {
        return this.passengers.loadPassenger(passengers);
    }

    @Override
    public int getPassengers() {
        return passengers.getPassengers();
    }
}
