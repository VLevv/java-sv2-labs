package stringbasic;

public class Student {
    private Person person;
    private String neptun;
    private String oktAz;
    private String cardNum;

    public Student(Person person, String neptun, String oktAz) {
        this.person = person;
        this.neptun = neptun;
        this.oktAz = oktAz;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getNeptun() {
        return neptun;
    }

    public void setNeptun(String neptun) {
        this.neptun = neptun;
    }

    public String getOktAz() {
        return oktAz;
    }

    public void setOktAz(String oktAz) {
        this.oktAz = oktAz;
    }

    public String getCardNum() {
        return cardNum;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }
}
