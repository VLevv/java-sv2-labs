package constructoroverloading.bus;

import java.util.ArrayList;
import java.util.List;

public class BusTimeTable {
    List<SimpleTime> timeTable=new ArrayList<>();

    public BusTimeTable(int firstHour,int lastHour,int everyMinute){
        for (int i=firstHour;i<=lastHour;++i){
            for (int j=0;j<60;j+=everyMinute){
                timeTable.add(new SimpleTime(i,j));
            }
        }
    }

    public BusTimeTable(List<SimpleTime> timeTable){
        this.timeTable =timeTable;
    }

    public List<SimpleTime> getTimeTable() {
        return timeTable;
    }

    public SimpleTime getNextBus(SimpleTime actual){
        for (SimpleTime time :
                timeTable) {
            if(actual.getHours()<=time.getHours()&&actual.getMinutes()<time.getMinutes()){
                return time;
            }
        }
        throw new IllegalArgumentException("No more buses");
    }
}
