package mehodstructure.pendrives;

import java.util.List;

public class Pendrives {
    public Pendrive getBest(List<Pendrive> pendrives){
        Pendrive best=pendrives.get(0);
        for(int i = 0;i< pendrives.size()-1;++i){
            if(pendrives.get(i).comparePricePerCapacity(pendrives.get(i+1))==1){
                best=pendrives.get(i+1);
            }
        }
        return best;
    }

    public Pendrive getCheapest(List<Pendrive> pendrives){
        Pendrive cheapest= pendrives.get(0);
        for(int i =0;i< pendrives.size()-1;i++){
            if(pendrives.get(i+1).isCheaperThan(pendrives.get(i))){
                cheapest=pendrives.get(i+1);
            }
        }
        return cheapest;
    }

    public void risePriceWhereCapacity(List<Pendrive> pendrives, int percent,int capacity){
        for (Pendrive p :
                pendrives) {
            if (p.getCapacity() == capacity) {
                p.risePrice(percent);
            }
            }
    }
}
