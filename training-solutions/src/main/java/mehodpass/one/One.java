package mehodpass.one;

public class One {
    public static void main(String[] args) {
        int number=20;
        System.out.println(number);
        number++;
        System.out.println(number);
        System.out.println(new One().addOne(number));
        System.out.println(number);
    }

    public int addOne(int number){
        return ++number;
    }
}
