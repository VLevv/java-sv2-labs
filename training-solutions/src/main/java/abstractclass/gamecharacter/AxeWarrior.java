package abstractclass.gamecharacter;

public class AxeWarrior extends Character{
    public AxeWarrior(Point position){
        setPosition(position);
    }

    private int getActualSecondaryDamage(){
        return getActualPrimaryDamage()+getActualPrimaryDamage();
    }

    @Override
    public void secondaryAttack(Character enemy) {
        if(getPosition().distance(enemy.getPosition())<2){
            hit(enemy,getActualSecondaryDamage());
        }
    }
}
