package stringbuilder.airport;

import java.util.ArrayList;
import java.util.List;

public class Airport {
    private List<Flight> flights = new ArrayList<>();

    public void addFlights(Flight flight){
        flights.add(flight);
    }

    public String getDeletedFlights(){
        StringBuilder builder =new StringBuilder();
        builder.append("Törölt járatok:\n");
        for (Flight flight:flights) {
            if(flight.getStatus()==Status.DELETED){
                builder.append(flight.getFlightNumber()+"\n");
            }
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        Flight flight = new Flight("B-2351",Status.DELETED);
        Flight flight1 = new Flight("N-312561",Status.DELETED);
        Flight flight2 = new Flight("S-35",Status.DELETED);
        Airport airport = new Airport();
        airport.addFlights(flight);
        airport.addFlights(flight1);
        airport.addFlights(flight2);
        System.out.println(airport.getDeletedFlights());
    }
}
