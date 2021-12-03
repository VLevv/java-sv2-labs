package abstractclass.exercise;

public class MathLesson {
    public static void main(String[] args) {
        MathExercise add=new Adder();
        MathExercise sub=new Subtracter();
        MathExercise mult=new Multiplier();
        MathExercise div=new Divisor();
        System.out.println(add.getSolution(3,4));
        System.out.println(sub.getSolution(3,4));
        System.out.println(mult.getSolution(3,4));
        System.out.println(div.getSolution(3,4));
    }
}
