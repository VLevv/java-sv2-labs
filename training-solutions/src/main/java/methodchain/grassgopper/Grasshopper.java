package methodchain.grassgopper;

public class Grasshopper {
    private int position;

    public int getPosition() {
        return position;
    }

    public void hopOnce(Direction direction){
        if(direction.equals(Direction.POSITIVE)){
            position++;
        }else {
            position--;
        }
    }

    public void moveZeroToThreeWithFiveHops(){
        hopOnce(Direction.POSITIVE);
        hopOnce(Direction.POSITIVE);
        hopOnce(Direction.POSITIVE);
        hopOnce(Direction.POSITIVE);
        hopOnce(Direction.NEGATIVE);
    }
}
