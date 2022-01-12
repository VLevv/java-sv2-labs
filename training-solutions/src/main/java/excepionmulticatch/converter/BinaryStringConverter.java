package excepionmulticatch.converter;

public class BinaryStringConverter {
    public boolean[] binaryStringToBooleanArray(String string){
        if (string==null){
            throw new NullPointerException("string can not be null");
        }
        boolean[] result = new boolean[string.length()];
        for(int i = 0;i<string.length();++i){
            if(string.charAt(i)!='1'||string.charAt(i)!='0'){
                throw new IllegalArgumentException("Invalid input "+string);
            }
            result[i]= string.charAt(i) == '1';
        }
        return result;
    }

    public String booleanArrayToBinaryString(boolean[] array){
        if (array==null){
            throw new NullPointerException("Array can not be null");
        }
        if(array.length==0){
            throw new IllegalArgumentException("Array is empty");
        }
        StringBuilder builder = new StringBuilder();
        for (boolean b : array) {
            if (b) {
                builder.append(1);
            } else {
                builder.append(0);
            }
        }
        return builder.toString();
    }
}
