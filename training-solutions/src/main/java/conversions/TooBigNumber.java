package conversions;

public class TooBigNumber {
    public long getRightResult(int number){
        long tmp = 2_147_483_647;
        return tmp+number;
    }

    public static void main(String[] args) {
        TooBigNumber number = new TooBigNumber();
        System.out.println(number.getRightResult(40));
    }
}
