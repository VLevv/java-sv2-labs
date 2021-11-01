package typeconversion;

public class Conversion {
    public double convertDoubleToDouble(double num){
        int a = (int)num;
        return (double) a;
    }

    public byte[] convertIntArrayToByteArray(int[] intArr){
        byte[] bytes = new byte[intArr.length];
        for (int i= 0;i<bytes.length;++i){
            if(intArr[i]<=127&&intArr[i]>=0){
                bytes[i]=(byte) intArr[i];
            }
            else {
                bytes[i]=-1;
            }
        }
        return bytes;
    }

    public int getFirsDecimal(double number){
        int tmp=(int)number;
        number-=tmp;
        tmp=(int)(number*10);
        return tmp;
    }
}
