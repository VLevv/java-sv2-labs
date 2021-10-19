package introcontrol;

public class IntroControlMain {
    public static void main(String[] args) {
        IntroControl control = new IntroControl();
        System.out.println(control.subtractTenIfGreaterThanTen(45));
        System.out.println(control.subtractTenIfGreaterThanTen(5));
        System.out.println(control.describeNumber(0));
        System.out.println(control.describeNumber(10));
        System.out.println(control.greetingToJoe("Joe"));
        System.out.println(control.greetingToJoe("Jhon"));
        System.out.println(control.calculateBonus(1000000));
        System.out.println(control.calculateBonus(100000));
        System.out.println(control.calculateConsumption(100,200));
        System.out.println(control.calculateConsumption(200,100));
        control.printNumbers(7);
        control.printNumbersBetween(12,17);
        control.printNumbersBetweenAnyDirection(3,8);
        control.printNumbersBetweenAnyDirection(13,8);
        control.printOddNumbers(13);
        control.printOddNumbers(16);
    }

}
