package exceptions.sum;

public class NumbersSum {
    public int getSum(int[] numbers){
        if(numbers==null){
            throw new IllegalArgumentException("null pointer was given");
        }
        int sum=0;
        for (int i:
             numbers) {
            sum+=i;
        }
        return sum;
    }

    public int getSum(String[] numbers){
        if(numbers==null){
            throw new IllegalArgumentException("null pointer was given");
        }
        int sum=0;
        try{
        for (String s:
                numbers) {
            sum+=Integer.parseInt(s);
        }
        }catch(UnsupportedOperationException ex){
            throw new IllegalArgumentException("Non number was given");
        }
        return sum;
    }
}
