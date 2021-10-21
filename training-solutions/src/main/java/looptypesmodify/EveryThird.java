package looptypesmodify;

public class EveryThird {
    void changeToZero(int [] numbers){
        for(int i = numbers.length-1;i>=0;i-=3){
            numbers[i]=0;
        }
    }

    public static void main(String[] args) {
        int[] numbers={2, 6, 3, 5, 7, 2, 6, 2, 3, 5, 7, 3, 2, 9};
        EveryThird everyThird = new EveryThird();
        for (int num:numbers) {
            System.out.print(num+" ");
        }
        System.out.println();
        everyThird.changeToZero(numbers);
        for(int num:numbers){
            System.out.print(num+" ");
        }
    }
}
