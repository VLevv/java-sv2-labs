package arrayofarrays;

import java.util.zip.ZipEntry;

public class Triangular {
    public int[][] triangularMatrix(int size){
        int[][] tempArr=new int[size][];
        for (int i =0;i<size;++i){
        tempArr[i]=new int[i+1];
        for(int j = 0;j<tempArr[i].length;++j){
            tempArr[i][j]=i;
        }
        }
        return tempArr;
    }

    public static void main(String[] args) {
        Triangular triangular = new Triangular();
        int[][] triangle = triangular.triangularMatrix(6);
        for(int i=0;i<triangle.length;++i){
            for (int j =0;j<triangle[i].length;++j){
                System.out.print(triangle[i][j]+" ");
            }
            System.out.println();
        }
    }
}
