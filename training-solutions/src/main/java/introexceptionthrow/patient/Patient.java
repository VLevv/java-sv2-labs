package introexceptionthrow.patient;

import introexceptionthrow.Validation;

public class Patient {
    private String name;
    private String socialSecurityNumber;
    private int yearOfBirth;

    public Patient(String name, String socialSecurityNumber, int yearOfBirth) {
        if(name.equals(null)||name.equals("")){
            throw new IllegalArgumentException("Hibás név!");
        }
        if(yearOfBirth<1900){
            throw new IllegalArgumentException("Hibás év!");
        }
        if(!new SsnValidator().isValidSsn(socialSecurityNumber)){
            throw new IllegalArgumentException("Hibás TAJ!");
        }
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public static void main(String[] args) {
        Patient patient = new Patient("alma","110000000",1950);
    }
}
