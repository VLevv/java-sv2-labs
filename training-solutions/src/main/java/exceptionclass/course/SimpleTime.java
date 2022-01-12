package exceptionclass.course;

public class SimpleTime {
    private String hour;
    private String minute;

    public SimpleTime(String hour, String minute) {
        if(Integer.parseInt(hour)>23||Integer.parseInt(hour)<0){
            throw new InvalidTimeException("Hour is invalid "+hour);
        }
        if(Integer.parseInt(minute)>60||Integer.parseInt(minute)<0){
            throw new InvalidTimeException("Minute is invalid "+minute);
        }
        if(hour==null||minute==null){
            throw new InvalidTimeException("Time is null");
        }
        this.hour = hour;
        this.minute = minute;
    }

    public SimpleTime(String time){
        if(time.contains(":")&&!time.endsWith(":")){
            throw new InvalidTimeException("Time is not hh:mm");
        }
        int tmpHour=Integer.parseInt(time.substring(0,time.indexOf(":")));
        int tmpMinute=Integer.parseInt(time.substring(time.indexOf(":")+1));
        if(tmpHour>23||tmpHour<0){
            throw new InvalidTimeException("Hour is invalid "+tmpHour);
        }
        if(tmpMinute>60||tmpMinute<0){
            throw new InvalidTimeException("Minute is invalid "+tmpMinute);
        }
        if(time==null){
            throw new InvalidTimeException("Time is null");
        }
        String[] tmp = time.split(":");
        hour=tmp[0];
        minute=tmp[1];
    }

    public String getHour() {
        return hour;
    }

    public String getMinute() {
        return minute;
    }

    @Override
    public String toString() {
        return hour+":"+minute;
    }
}
