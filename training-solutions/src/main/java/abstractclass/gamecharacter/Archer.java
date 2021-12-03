package abstractclass.gamecharacter;

public class Archer extends Character{
    private int numberOfArrow;

    public Archer(Point position) {
        setPosition(position);
        numberOfArrow = 100;
    }

    public int getNumberOfArrow() {
        return numberOfArrow;
    }

    private int getActualSecondaryDamage(){
        return getRandom().nextInt(1,6);
    }

    private void shootingAnArrow(Character enemy){
        numberOfArrow--;
        hit(enemy,getActualSecondaryDamage());
    }

    @Override
    public void secondaryAttack(Character enemy) {
        shootingAnArrow(enemy);
    }
}
