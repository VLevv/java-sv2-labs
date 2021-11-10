package meetingrooms;

import java.util.ArrayList;
import java.util.List;

public class Office {
    private List<MeetingRoom> meetingRooms= new ArrayList<>();

    public void addMeetingRoom(MeetingRoom meetingRoom){
        meetingRooms.add(meetingRoom);
    }

    public void printNames(){
        boolean first = true;
        for (MeetingRoom m :
                meetingRooms) {
            if(first){
                first=false;
            }
            else {
                System.out.print(", ");
            }
            System.out.print(m.getName());
        }
        System.out.println();
    }

    public void printNamesReverse(){
        for(int i = meetingRooms.size()-1;i>=0;--i){
            if(!(i==meetingRooms.size()-1)){
                System.out.print(", ");
            }
            System.out.print(meetingRooms.get(i).getName());
        }
        System.out.println();
    }

    public void printEvenNames(){
        for(int i = 1;i<meetingRooms.size();i+=2){
            if(!(i==1)){
                System.out.print(", ");
            }
            System.out.print(meetingRooms.get(i).getName());
        }
        System.out.println();
    }

    public void printAreas(){
        StringBuilder builder = new StringBuilder();
        for (MeetingRoom m:meetingRooms) {
            builder.append(m.getName()+" ");
            builder.append(m.getLength()+" ");
            builder.append(m.getWidth()+" ");
            builder.append(m.getArea());
            System.out.println(builder.toString());
            builder.delete(0,builder.length());
        }
    }

    public void printMeetingRoomsWithName(String name) {
        for (MeetingRoom m :
                meetingRooms) {
            if(m.getName().equals((name))){
                System.out.println(m.getName());
                System.out.println(m.getLength());
                System.out.println(m.getWidth());
                System.out.println(m.getArea());
            }
        }
    }
    public void printMeetingRoomsContains(String part){
        String tmpName = part.toLowerCase();
        for (MeetingRoom m :
                meetingRooms) {
            if(m.getName().toLowerCase().contains(tmpName)){
                System.out.println(m.getName());
                System.out.println(m.getLength());
                System.out.println(m.getWidth());
                System.out.println(m.getArea());
            }
        }
    }

    public void printAreasLargerThan(int area){
        for (MeetingRoom m :
                meetingRooms) {
            if(area<m.getArea()){
                System.out.println(m.getName());
                System.out.println(m.getLength());
                System.out.println(m.getWidth());
                System.out.println(m.getArea());
            }
        }
    }
}
