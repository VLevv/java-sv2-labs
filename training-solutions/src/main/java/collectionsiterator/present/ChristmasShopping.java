package collectionsiterator.present;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ChristmasShopping {
    private List<ChristmasPresent> presents;

    public ChristmasShopping(List<ChristmasPresent> presents) {
        this.presents = presents;
    }

    public List<ChristmasPresent> getPresents() {
        return presents;
    }

    public void addNewPresent(ChristmasPresent present){
        presents.add(present);
    }

    public void removeTooExpensivePresent(int maxPrice){
        Iterator<ChristmasPresent> presentIterator=presents.listIterator();
        while(presentIterator.hasNext()){
            if(presentIterator.next().getPrice()>maxPrice){
                presentIterator.remove();
            }
        }
    }
}
