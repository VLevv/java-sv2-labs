package abstractclass.gamecharacter;

import java.util.Random;

public abstract class Character {
    private Point position;
    private int hitPoint=100;
    private Random random=new Random();

    public boolean isAlive(){
        if(hitPoint>0){
            return true;
        }
        return false;
    }

    protected int getActualPrimaryDamage(){
        return random.nextInt(1,11);
    }

    private int getActualDefence(){
        return random.nextInt(1,6);
    }

    protected void hit(Character enemy,int damage){
        if(getActualDefence()<damage){
            enemy.decreaseHitPoint(damage);
        }
    }

    public void primaryAttack(Character enemy){
        hit(enemy,getActualPrimaryDamage());
    }

    private void decreaseHitPoint(int diff) {
        hitPoint-=diff;
    }

    public abstract void secondaryAttack(Character enemy);

    public void setPosition(Point position) {
        this.position = position;
    }

    public Point getPosition() {
        return position;
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public Random getRandom() {
        return random;
    }
}
