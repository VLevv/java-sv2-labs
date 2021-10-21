package arrayofarrays;

import java.time.LocalDate;
import java.time.Month;

public class DalyValues {
    int[][] getValues(){
        LocalDate localDate = LocalDate.of(2000,Month.JANUARY,31);
        int [][] tempInt = new int[12][];
        for(int i = 0;i<12;++i){
            tempInt[i] = new int[localDate.plusMonths(i).getMonth().length(false)];
        }
        return tempInt;
    }

    public static void main(String[] args) {
        DalyValues values = new DalyValues();
        int[][] testInt = values.getValues();
        for(int i=0;i<testInt.length;++i){
            for (int j =0;j<testInt[i].length;++j){
                System.out.print(testInt[i][j]+" ");
            }
            System.out.println();
        }
    }
}
