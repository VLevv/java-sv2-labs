package introexceptionthrow;

public class Validation {
    public void validateName(String name){
        if(name.equals(null)||name.equals("")){
            throw new IllegalArgumentException("Adjon meg nevet!");
        }
    }

    public void validateAge(String ageString){
        if(ageString.equals("")){
            throw new IllegalArgumentException("Üres mező!");
        }
        for(int i = 0;i<ageString.length();++i){
            if(!Character.isDigit(ageString.charAt(i))){
                throw new IllegalArgumentException("Nem szám!");
            }
        }
        if(Integer.parseInt(ageString)>120||Integer.parseInt(ageString)<=0){
            throw new IllegalArgumentException("Hibás életkor!");
        }
    }
}
