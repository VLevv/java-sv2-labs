package enumtype.solarsystem;

public class SolarSystemMain {
    public static void main(String[] args) {
        for (SolarSystem s:SolarSystem.values()){
            System.out.println(s.getValue());
        }
    }
}
