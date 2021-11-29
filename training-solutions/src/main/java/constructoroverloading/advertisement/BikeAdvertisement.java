package constructoroverloading.advertisement;

import java.util.List;

public class BikeAdvertisement {
    private String description;
    private int price;
    private List<String> extras;
    private String brand;
    private String serialNumber;

    public BikeAdvertisement(String description,int price){
        this.description=description;
        this.price=price;
    }

    public BikeAdvertisement(String description,int price, String brand){
        this(description, price);
        this.brand=brand;
    }

    public BikeAdvertisement(String description,int price,String brand,List<String> extras){
        this(description, price, brand);
        this.extras=extras;
    }

    public BikeAdvertisement(String description,int price,String brand,List<String> extras,String serialNumber){
        this(description, price, brand,extras);
        this.serialNumber=serialNumber;
    }
}