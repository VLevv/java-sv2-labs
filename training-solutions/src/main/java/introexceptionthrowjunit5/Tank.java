package introexceptionthrowjunit5;

public class Tank {
    private int angle;

    public int getAngle() {
        return angle;
    }

    public void modifyAngle(int angleNumber){
        if((angleNumber+angle<-80)||(angle+angleNumber>80)){
            throw new IllegalArgumentException("Nem fordítható a cső!");
        }
        angle+=angleNumber;
    }
}
