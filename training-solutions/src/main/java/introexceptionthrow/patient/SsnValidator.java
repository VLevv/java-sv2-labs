package introexceptionthrow.patient;

public class SsnValidator {
    public boolean isValidSsn(String ssn) {
        if (ssn.length() != 9) {
            return false;
        }
        for(int i = 0;i<9;i++){
            if(!Character.isDigit(ssn.charAt(i))){
                throw new IllegalArgumentException("Hibás TAJ!");
            }
        }
        int tmpSum = 0;
        for (int i = 0; i < 8; i += 2) {
            tmpSum += (Integer.parseInt(Character.toString(ssn.charAt(i))) * 3);
        }
        for (int i = 1; i < 8; i += 2) {
            tmpSum += (Integer.parseInt(Character.toString(ssn.charAt(i))) * 7);
        }
        if(tmpSum%10!=Integer.parseInt(Character.toString(ssn.charAt(ssn.length()-1)))){
            return false;
        }
        return true;
    }
}
