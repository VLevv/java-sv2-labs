package algorithmscount.digit;

public class Digits {
    public int getCountOfNumbers(){
        int c = 0;
        for(int i =10;i<100;++i){
            if((i/10)-(i-(i/10*10))==5){
                c++;
            }
            if((i-(i/10*10))-(i/10)==5){
                c++;
            }
        }
        return c;
    }
}
