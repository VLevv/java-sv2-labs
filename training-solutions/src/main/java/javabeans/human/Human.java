package javabeans.human;

public class Human {
    private String name;
    private double weight;
    private int iq;

    public Human(){
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public int getIq() {
        return iq;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }
}
