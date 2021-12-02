package inheritancemethods.plane;

public class Plane {
    public static void main(String[] args) {
        Passenger passenger =new Passenger("Jani",30000);
        PriorityPassenger priorityPassenger = new PriorityPassenger("Peti",30000,10);
        FirstClassPassenger firstClassPassenger = new FirstClassPassenger("Gabi",30000,10);
        System.out.println(passenger.getPriceOfPlaneTicket());
        System.out.println(priorityPassenger.getPriceOfPlaneTicket());
        System.out.println(firstClassPassenger.getPriceOfPlaneTicket());
    }
}
