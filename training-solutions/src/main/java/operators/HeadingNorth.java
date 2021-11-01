package operators;

public class HeadingNorth {
    public int getNumberOfNewDirections(){
        int newIncrement=10;
        int directionChangeCount=1;
        int sumOfChanges=10;
        while(true){
            if(sumOfChanges%360==0){
                return directionChangeCount;
            }
            newIncrement+=10;
            directionChangeCount+=1;
            sumOfChanges+=newIncrement;
        }
    }

    public static void main(String[] args) {
        System.out.println(new HeadingNorth().getNumberOfNewDirections());
    }
}
