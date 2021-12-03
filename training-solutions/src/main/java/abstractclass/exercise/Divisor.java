package abstractclass.exercise;

public class Divisor extends MathExercise{
    @Override
    public int getSolution(int a, int b) {
        if(b==0){
            throw new IllegalArgumentException("Invalid input");
        }
        return a/b;
    }
}
