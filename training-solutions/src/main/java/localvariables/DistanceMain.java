package localvariables;

public class DistanceMain {
    public static void main(String[] args) {
        Distance distance=new Distance(3.14,false);
        System.out.println(distance.getDistanceKm());
        System.out.println(distance.isExact());
        int distanceInInt=(int)distance.getDistanceKm();
        System.out.println(distanceInInt);
    }
}
