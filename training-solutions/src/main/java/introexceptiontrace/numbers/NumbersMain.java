package introexceptiontrace.numbers;

public class NumbersMain {
    public static void main(String[] args) {
        Change change = new Change();
        int[] tmp = change.changeNumbers();
        for (int i :
                tmp) {
            System.out.println(i);
        }
    }
}
