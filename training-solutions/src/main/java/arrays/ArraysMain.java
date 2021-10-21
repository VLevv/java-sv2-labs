package arrays;


import java.util.Arrays;

public class ArraysMain {
    String numberOfDaysAsString(){
        int[] numberOfDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return Arrays.toString(numberOfDays);
    }

    String multiplicationTableAsString(int size){
        int[][] tempArr=new int[size][size];
        for (int i =0;i<size;++i){
            for(int j = 0;j<tempArr[i].length;++j){
                tempArr[i][j]=(i+1)*(j+1);
            }
        }
        return Arrays.toString(tempArr);
    }

    boolean sameTempValues(double[] day, double[] anotherDay){
        return Arrays.equals(day,anotherDay);
    }

    boolean sameTempValuesDaylight(double[] day, double[] anotherDay){
        return Arrays.equals(Arrays.copyOfRange(day,0,Math.min(day.length,anotherDay.length)),Arrays.copyOfRange(anotherDay,0,Math.min(day.length,anotherDay.length)));
    }

    boolean wonLottery(int[] player, int[] machine){
       int[]tmpPlayer=new int[player.length];
       int[]tmpMachine=new int[machine.length];
       tmpPlayer=Arrays.copyOf(player,player.length);
       tmpMachine=Arrays.copyOf(machine,machine.length);
       Arrays.sort(tmpPlayer);
       Arrays.sort(tmpMachine);
       return Arrays.equals(tmpMachine,tmpPlayer);
    }

    public static void main(String[] args){
        ArraysMain arraysMain = new ArraysMain();
    int [] winner = {5, 2, 1, 4, 3};
    int [] notWinner = {1, 2, 7, 3, 4};
    int [] numbers = {3, 2, 5, 4, 1};
        System.out.println(arraysMain.wonLottery(winner,numbers));
        System.out.println(arraysMain.wonLottery(notWinner,numbers));
        System.out.println(Arrays.toString(winner));
        System.out.println(Arrays.toString(notWinner));
        System.out.println(Arrays.toString(numbers));
    }
}
