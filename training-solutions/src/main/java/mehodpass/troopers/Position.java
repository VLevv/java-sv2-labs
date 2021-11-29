package mehodpass.troopers;

public class Position {
    private final double posX;
    private final double posY;

    public Position(double posX, double posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public double getPosX() {
        return posX;
    }

    public double getPosY() {
        return posY;
    }

    public double distanceFrom(Position position){
        validation(position);
        return Math.sqrt(Math.pow((posX-position.getPosX()),2)+Math.pow((posX-position.getPosY()),2));
    }

    private void validation(Position p){
        if (p==null){
            throw new IllegalArgumentException("Missing data");
        }
    }
}
