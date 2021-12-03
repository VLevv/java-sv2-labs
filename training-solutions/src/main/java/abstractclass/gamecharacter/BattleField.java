package abstractclass.gamecharacter;

public class BattleField {
    private int round;

    public int getRound() {
        return round;
    }

    private boolean oneHit(Character attacker,Character defender){
        attacker.primaryAttack(defender);
        attacker.secondaryAttack(defender);
        if(attacker.getHitPoint()>0&&defender.getHitPoint()>0){
            return true;
        }
        return false;
    }

    public Character fight(Character one,Character other){
        while(oneHit(one,other)&&oneHit(other,one)){
            round++;
        }
        if (one.isAlive()){
            return one;
        }else {
            return other;
        }
    }


}
