package isahasa.flotta;

public class FerryBoat implements Ship,CanCarryGoods,CanCarryPassengers{
    private CanCarryPassengers passengers;
    private CanCarryGoods goods;

    public FerryBoat(int passengers,int maxPassengers,int cargoWeight,int maxCargoWeight) {
        this.passengers=new CanCarryPassengersBehaviour(passengers,maxPassengers);
        goods=new CanCarryGoodsBehaviour(cargoWeight,maxCargoWeight);
    }

    @Override
    public int loadCargo(int cargoWeight) {
        return goods.loadCargo(cargoWeight);
    }

    @Override
    public int getCargoWeight() {
        return goods.getCargoWeight();
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
