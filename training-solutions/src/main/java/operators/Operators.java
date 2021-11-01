package operators;

public class Operators {
    public boolean isEven(int n){
        if(n%2==0){
            return true;
        }
        return false;
    }

    public String getResultOfDivision(int number,int divisor){
        return number+" / "+divisor+" = "+(number/divisor)+", maradék: "+(number%divisor);
    }

    public String isNull(String s){
        return s==null?"null értékű":"nem null értékű";
    }

    public boolean isEmpty(String s){
        if(s==null||s==""){
            return true;
        }
        return false;
    }
}
