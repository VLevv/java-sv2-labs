package interfaceextends.robot;

import java.util.ArrayList;
import java.util.List;

public class AstroBoy implements FlyableRobot{
    private Point position;
    private int angle;
    private List<Point> path=new ArrayList<>();
    public static final long ALTITUDE=5;

    public AstroBoy(Point position) {
        this.position = position;
        path.add(position);
    }

    private void flyTo(Point position){
        path.add(new Point(position.getX(),position.getY(),position.getZ()+ALTITUDE));
        path.add(position);
    }

    @Override
    public void liftTo(long altitude) {
        path.add(new Point(path.get(path.size()-1).getX(),path.get(path.size()-1).getY(),path.get(path.size()-1).getZ()+altitude));
    }

    @Override
    public void moveTo(Point position) {
        this.position=position;
        walkTo(position);
    }

    @Override
    public void fastMoveTo(Point position) {
        this.position=position;
        liftTo(ALTITUDE);
        flyTo(position);
    }

    @Override
    public void rotate(int angle) {
        this.angle+=angle;
    }

    @Override
    public List<Point> getPath() {
        return path;
    }

    private void walkTo(Point position){
        path.add(position);
    }

    public Point getPosition() {
        return position;
    }

    public int getAngle() {
        return angle;
    }
}
