package controliteration.day;

import java.util.ArrayList;
import java.util.List;

public class Day {
    private List<Hour> hours=new ArrayList<>();

    public List<Hour> getHours() {
        return hours;
    }

    public void addHour(Hour hour){
        hours.add(hour);
    }

    public void setDayPeriod(){
        for (Hour h :
                hours) {
            if(h.getHourNumber()>=6&&h.getHourNumber()<=22){
                h.setPeriod(DayPeriod.DAYTIME);
            }
            else {
                h.setPeriod(DayPeriod.NIGHTTIME);
            }
        }
    }
}
