package defaultconstructor.simpledate;

import java.time.LocalDate;
import java.time.Month;

public class SimpleDate {
    private int year;
    private int month;
    private int day;

    public void setDate(int year,int month,int day){
        if(!isCorrect(year,month,day)){
            throw new IllegalArgumentException("Incorrect data");
        }
        this.day=day;
        this.month=month;
        this.year=year;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    private boolean isCorrect(int year, int month, int day){
        if(year<1900||month>12||month<1||day<1||day> calculateMonthLength(year,month)){
            return false;
        }
        return true;
    }

    private boolean isLeapYear(int year){
     return LocalDate.of(year,1,1).isLeapYear();
    }

    private int calculateMonthLength(int year, int month){
        return Month.of(month).length(isLeapYear(year));
    }
}
