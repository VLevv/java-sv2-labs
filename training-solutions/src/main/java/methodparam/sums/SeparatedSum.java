package methodparam.sums;

public class SeparatedSum {
    public String sum(String floatingNumbers){
        floatingNumbers=floatingNumbers.replace(',','.');
        String[] tmp=floatingNumbers.split(";");
        double sumPoz=0;
        double sumNeg=0;
        double[] values=new double[tmp.length];
        for(int i = 0;i<tmp.length;++i){
            values[i]=Double.parseDouble(tmp[i]);
        }
        for (double i :
                values) {
            if (i > 0){
                sumPoz+=i;
            }else if(i<0){
                sumNeg+=i;
            }
        }
        sumPoz=rounder(sumPoz);
        sumNeg=rounder(sumNeg);
        return sumPoz+" "+sumNeg;
    }

    private double rounder(double num){
        double tmp =num-(int)num;
        tmp*=10;
        tmp=Math.round(tmp);
        num=(int)num;
        return num+tmp/10;
    }
}
