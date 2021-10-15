package classstructuremethods;

public class ClientMain {
    public static void main(String[] args) {
        Client client=new Client();
        client.setName("Vadas Levente");
        client.setAddress("Népkert");
        client.setYear(2000);
        System.out.println(client.getAddress()+"\n"+client.getName()+"\n"+client.getYear());
        client.migrate("Kopaszi-gát");


    }
}
