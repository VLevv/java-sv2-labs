package introinheritance.fruit;

public class FruitsMain {
    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        fruit.setName("gyümölcs");
        fruit.setWeight(1);
        System.out.println(fruit.getName());
        System.out.println(fruit.getWeight());
        Grape grape = new Grape();
        grape.setName("Szőlő");
        grape.setWeight(2);
        grape.setType("Lila");
        System.out.println(grape.getName());
        System.out.println(grape.getWeight());
        System.out.println(grape.getType());
        Apple apple = new Apple();
        apple.setName("Alma");
        apple.setWeight(0.1);
        apple.setPieces(12);
        System.out.println(apple.getName());
        System.out.println(apple.getWeight());
        System.out.println(apple.getPieces());
        GoldenDelicious goldenDelicious = new GoldenDelicious();
        goldenDelicious.setName("sárga");
        goldenDelicious.setWeight(0.3);
        goldenDelicious.setPieces(13);
        goldenDelicious.setColour(Colour.YELLOW);
        System.out.println(goldenDelicious.getName());
        System.out.println(goldenDelicious.getWeight());
        System.out.println(goldenDelicious.getPieces());
        System.out.println(goldenDelicious.getColour());
        Starking starking = new Starking();
        starking.setName("Piros");
        starking.setWeight(0.4);
        starking.setPieces(11);
        starking.setColour(Colour.RED);
        System.out.println(starking.getName());
        System.out.println(starking.getWeight());
        System.out.println(starking.getPieces());
        System.out.println(starking.getColour());
    }
}
