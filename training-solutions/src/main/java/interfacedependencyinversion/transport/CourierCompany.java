package interfacedependencyinversion.transport;

public class CourierCompany {
    public static void main(String[] args) {
        Box s = new SmallBox();
        Box m = new MediumBox();
        Box l = new LargeBox();
        Box x = new ExtraLargeBox();

        System.out.println(s.getPrice());
        System.out.println(s.getSize());
        System.out.println(m.getPrice());
        System.out.println(m.getSize());
        System.out.println(l.getPrice());
        System.out.println(l.getSize());
        System.out.println(x.getPrice());
        System.out.println(x.getSize());
    }
}
