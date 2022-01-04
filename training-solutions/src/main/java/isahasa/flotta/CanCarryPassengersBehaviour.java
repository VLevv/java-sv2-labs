package isahasa.flotta;

public class CanCarryPassengersBehaviour implements CanCarryPassengers{
    private int passengers;
    private int maxPassengers;

    public CanCarryPassengersBehaviour(int passengers, int maxPassengers) {
        this.passengers = passengers;
        this.maxPassengers = maxPassengers;
    }

    @Override
    public int getPassengers() {
        return passengers;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    @Override
    public int loadPassenger(int passengers) {
        if (this.passengers+passengers<maxPassengers){
            this.passengers+=passengers;
            return 0;
        }
        passengers-=maxPassengers-this.passengers;
        this.passengers=maxPassengers;
        return passengers;
    }
}
