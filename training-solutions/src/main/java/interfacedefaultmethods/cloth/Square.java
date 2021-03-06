package interfacedefaultmethods.cloth;

public interface Square {
    default int getNumberOfSides(){
        return 4;
    }

    double getSide();

    default double getLengthOfDiagonal(){
        return Math.sqrt(2)*getSide();
    }

    default double getPerimeter(){
        return 4*getSide();
    }

    default double getArea(){
        return Math.pow(getSide(),2);
    }
}
