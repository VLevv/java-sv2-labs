package array;

public class ArrayMain {
    public static void main(String[] args) {
        String[] week={"hétfő", "kedd", "szerda", "csütörtök", "péntek", "szombat", "vasárnap"};
        System.out.println(week[1]);
        System.out.println(week.length);
        int[] numbers = new int[5];
        numbers[0]=1;
        for (int i = 1;i<numbers.length;++i){
            numbers[i]=numbers[i-1]*2;
        }
        for (int i:numbers) {
            System.out.print(i+" ");
        }
        System.out.println();
        boolean[] trueOrFalse = new boolean[6];
        for (int i = 1 ;i<trueOrFalse.length;++i){
            trueOrFalse[i]=!trueOrFalse[i-1];
        }
        for(boolean state:trueOrFalse){
            System.out.print(state+" ");
        }
    }
}
