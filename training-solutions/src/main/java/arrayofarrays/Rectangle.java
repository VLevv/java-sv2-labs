package arrayofarrays;

public class Rectangle {
    public int[][] rectangularMatrix(int size){
        int[][] tempArr=new int[size][size];
        for (int i =0;i<size;++i){
            for(int j = 0;j<tempArr[i].length;++j){
                tempArr[i][j]=i;
            }
        }
        return tempArr;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        int[][] testRec = rectangle.rectangularMatrix(4);
        for(int i=0;i<testRec.length;++i){
            for (int j =0;j<testRec[i].length;++j){
                System.out.print(testRec[i][j]+" ");
            }
            System.out.println();
        }
    }
}
