package mehodstructure.bmi;

public class BodyMass {
    private int kg;
    private double height;

    public BodyMass(int kg, double height) {
        this.kg = kg;
        this.height = height;
    }

    public int getKg() {
        return kg;
    }

    public double getHeight() {
        return height;
    }

    public double getBodyMassIndex(){
        return (double) kg/Math.sqrt(height);
    }

    public BmiCategory getBody(){
        if(getBodyMassIndex()<18.5){
            return BmiCategory.UNDERWEIGHT;
        }else if(getBodyMassIndex()>25){
            return BmiCategory.OVERWEIGHT;
        }
        return BmiCategory.NORMAL;
    }

    public boolean isThinnerThan(BodyMass other){
        if(getBodyMassIndex()<other.getBodyMassIndex()){
            return true;
        }
        return false;
    }
}
