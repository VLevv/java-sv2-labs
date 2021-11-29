package constructoroverloading.bus;

public class SimpleTime {
    private int hours;
    private int minutes;

    public SimpleTime(int hours){
        this.hours=hours;
    }

    public SimpleTime(int hours,int minutes){
        this(hours);
        this.minutes=minutes;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public SimpleTime(SimpleTime time){
        this(time.hours, time.minutes);
    }

    public int getDifference(SimpleTime time){
        return Math.abs((hours- time.hours)*60+(minutes- time.minutes));
    }

    @Override
    public String toString() {
        return "SimpleTime{" +
                "hours=" + hours +
                ", minutes=" + minutes +
                '}';
    }
}
