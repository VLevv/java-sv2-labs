package mathproblems;

public class Division {
    public void getDivisor(int number){
        for(int i = 1;i<=number/2;++i){
            if(number%i==0){
                System.out.println(number +" osztója: "+i);
            }
        }
        System.out.println(number +" osztója: "+number);
    }

    public void getRightNumbers(int[] numbers){
        for (int i = 1;i<numbers.length;++i) {
            if (numbers[i] % i == 0) {
                System.out.print(numbers[i]+" ");
            }
        }
    }

    public static void main(String[] args) {
        Division division = new Division();
        division.getDivisor(15);
        division.getDivisor(11);
        division.getDivisor(56);
        int[] test = {2, 5, 23, 56, -36, 45, 78, 14, -8, 4, 10};
        division.getRightNumbers(test);
    }
}
