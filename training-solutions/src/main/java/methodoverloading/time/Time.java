package methodoverloading.time;

import java.time.LocalTime;

public class Time {
    private LocalTime time;

    public Time(LocalTime time) {
        this.time = time;
    }

    public LocalTime getTime() {
        return time;
    }

    public boolean isEqual(Time time){
        return this.time.equals(time.getTime());
    }

    public boolean isEqual(int hours,int minutes,int seconds){
        return time.equals(LocalTime.of(hours,minutes,seconds));
    }

    public boolean isEarlier(Time time){
        return this.time.isBefore(time.getTime());
    }

    public boolean isEarlier(int hours,int minutes,int seconds){
        return time.isBefore(LocalTime.of(hours,minutes,seconds));
    }
}
