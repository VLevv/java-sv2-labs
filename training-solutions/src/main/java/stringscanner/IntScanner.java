package stringscanner;

import java.util.Scanner;

public class IntScanner {
    public String convertInts(String ints){
        Scanner scanner = new Scanner(ints).useDelimiter(";");
        StringBuilder builder = new StringBuilder();
        boolean first = true;
        while(scanner.hasNextInt()){
            int tmp=scanner.nextInt();
            if(tmp>100){
                if(first){
                    first=false;
                }
                else {
                    builder.append(",");
                }
                builder.append(tmp);
            }
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        IntScanner intScanner = new IntScanner();
        System.out.println(intScanner.convertInts("5;3;107;12;123;18;198"));
        System.out.println(intScanner.convertInts(""));
        System.out.println(intScanner.convertInts("5;3;10;12;12;18;19"));
        System.out.println(intScanner.convertInts("5;3;10;102;12;18;19"));
    }
}
