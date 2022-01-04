package isahasa.flotta;

public class CanCarryGoodsBehaviour implements CanCarryGoods{
    private int cargoWeight;
    private int maxCargoWeight;

    public CanCarryGoodsBehaviour(int cargoWeight, int maxCargoWeight) {
        this.cargoWeight = cargoWeight;
        this.maxCargoWeight = maxCargoWeight;
    }

    @Override
    public int getCargoWeight() {
        return cargoWeight;
    }

    public int getMaxCargoWeight() {
        return maxCargoWeight;
    }

    @Override
    public int loadCargo(int cargoWeight) {
        if (this.cargoWeight+cargoWeight<maxCargoWeight){
            this.cargoWeight+=cargoWeight;
            return 0;
        }
        cargoWeight-=maxCargoWeight-this.cargoWeight;
        this.cargoWeight=maxCargoWeight;
        return cargoWeight;
    }
}
