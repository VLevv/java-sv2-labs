package numbers;

public class Percent {
    public double getValue(int a,int b){
        return (double) a/100*b;
    }

    public double getBase(int a,int b){
        return (double) 100/b*a;
    }

    public double getPercent(int a ,int b){
        return (double) b/a*100;
    }

    public static void main(String[] args) {
        Percent percent = new Percent();
        System.out.println(percent.getValue(200,30));
        System.out.println(percent.getBase(60,30));
        System.out.println(percent.getPercent(60,30));
    }
}
