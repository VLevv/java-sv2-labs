package abstractclass.gamecharacter;

public class Point {
    private long x;
    private long y;

    public Point(long x, long y) {
        this.x = x;
        this.y = y;
    }

    public long getX() {
        return x;
    }

    public long getY() {
        return y;
    }

    public double distance(Point point){
        return Math.sqrt(Math.pow((x-point.x),2)+Math.pow((y-point.y),2));
    }
}
