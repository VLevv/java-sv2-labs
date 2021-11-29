package immutable.car;

import java.time.LocalDate;

public class Car {
    private final String brand;
    private final String type;
    private final int manufactureYear;

    public Car(String brand, String type, int manufactureYear) {
        validateBrand(brand);
        validateYear(manufactureYear);
        this.brand = brand;
        this.type = type;
        this.manufactureYear = manufactureYear;
    }

    private void validateBrand(String brand){
        if(brand.equals(null)||brand.equals("")){
            throw new IllegalArgumentException("Missing name");
        }
    }

    private void validateYear(int manufactureYear){
        if(manufactureYear> LocalDate.now().getYear()){
            throw new IllegalArgumentException("Invalid year");
        }
    }
}
