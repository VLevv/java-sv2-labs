package algorithmsmax.plane;

public class Plane {
    public int getLongestOcean(String map){
        int c=0;
        int max=0;
        for(int i = 0;i<map.length();++i){
            if(map.charAt(i)=='0'){
                c++;
            }else {
                if(max<c){
                    max=c;
                }
                c=0;
            }
        }
        return max;
    }
}
