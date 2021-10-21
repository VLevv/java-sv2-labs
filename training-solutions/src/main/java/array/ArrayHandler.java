package array;

public class ArrayHandler {
    public void addIndexToNumber(int[] source){
        for(int i = 0; i < source.length;++i){
            source[i]=source[i]+i;
        }
    }

    public void concatenateIndexToWord(String[] source){
        for (int i = 0; i < source.length;++i){
            source[i]=i+source[i];
        }
    }

    public static void main(String[] args) {
        ArrayHandler arrayHandler = new ArrayHandler();
        int[] numbers = {3, 25, 64, 56, 3, 46, 7, 43, 5};
        String[] texts = {"alma", "körte", "banán", "barack"};
        arrayHandler.addIndexToNumber(numbers);
        arrayHandler.concatenateIndexToWord(texts);
        for (int i:numbers) {
            System.out.println(i);
        }
        for (int i:numbers) {
            System.out.print(i+", ");
        }
        System.out.println();
        for (String i:texts){
            System.out.println(i);
        }for (String i:texts){
            System.out.print(i+", ");
        }
    }
}
