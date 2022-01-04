package isahasa.flotta;

public class CargoShip implements Ship,CanCarryGoods{
    private CanCarryGoods goods;

    public CargoShip(int cargoWeight,int maxCargoWeight) {
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
}
