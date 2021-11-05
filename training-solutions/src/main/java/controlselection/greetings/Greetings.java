package controlselection.greetings;

import java.time.LocalTime;

public class Greetings {
    public String greeter(LocalTime time){
        if(time.isBefore(LocalTime.of(20,0))&&time.isAfter(LocalTime.of(18,30))){
          return "jó estét";
        }
        else {
            if(time.isBefore(LocalTime.of(18,30))&&time.isAfter(LocalTime.of(9,0))){
                return "jó napot";
            }
            else {
                if(time.isBefore(LocalTime.of(9,0))&&time.isAfter(LocalTime.of(5,0))){
                    return "jó reggelt";
                }
                else {
                    return "jó éjt";
                }
            }
        }

    }
}
