package immutable.monument;

import java.time.LocalDate;

public class Monument {
    private final String name;
    private final String address;
    private final LocalDate startDate;
    private final int id;

    public Monument(String name, String address, LocalDate startDate, int id) {
        if(isEmpty(name)||isEmpty(address)||isEmpty(startDate.toString())||isEmpty(Integer.toString(id))){
            throw new IllegalArgumentException("Can not be empty");
        }
        this.name = name;
        this.address = address;
        this.startDate = startDate;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public int getId() {
        return id;
    }

    private boolean isEmpty(String text){
        if(text.equals(null)||text.equals("")){
            return true;
        }
        return false;
    }
}
