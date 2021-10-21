package looptypes;

public class Sum {
    void printSums(int[] numbers){
        for(int i = 0;i<numbers.length-1;++i){
            System.out.print((numbers[i]+numbers[i+1])+" ");
        }
    }

    public static void main(String[] args) {
        int[] numbers = {2, 6, 3, 5, 7, 9};
        Sum sum = new Sum();
        sum.printSums(numbers);
    }
}
