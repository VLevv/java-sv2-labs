package mehodpass.troopers;

public class Trooper {
    private String name;
    private Position position;

    public Trooper(String name) {
        this.name = name;
        position = new Position(0,0);
    }

    public String getName() {
        return name;
    }

    public Position getPosition() {
        return position;
    }

    public void changePosition(Position target){
        validation(target);
        position=target;
    }

    public double distanceFrom(Position target){
        validation(target);
        return position.distanceFrom(target);
    }

    private void validation(Position position){
        if(name.equals("")||position==null){
            throw new IllegalArgumentException("Invalid data");
        }
    }
}
