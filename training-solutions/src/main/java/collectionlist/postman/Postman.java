package collectionlist.postman;

import java.util.LinkedList;
import java.util.List;

public class Postman {
    private List<String> addresses = new LinkedList<>();

    public List<String> getAddresses() {
        return addresses;
    }

    public void addAddress(String address){
        addresses.add(address);
    }

    public void removeAddress(String address){
        addresses.remove(address);
    }
}
