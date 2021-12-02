package introinheritance.coffee;

public class CoffeeMain {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        Cappuccino cappuccino = new Cappuccino();
        coffee.setName("fekete");
        coffee.setPrice(200);
        cappuccino.setName("krémes");
        cappuccino.setPrice(300);
        System.out.println(coffee.getName());
        System.out.println(coffee.getPrice());
        System.out.println(cappuccino.getName());
        System.out.println(cappuccino.getPrice());
    }
}
