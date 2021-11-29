package algorithmsmax.sales;

import java.util.List;

public class Sales {
    public Salesperson selectSalesPersonWithMaxSalesAmount(List<Salesperson> salespeople){
        int max=salespeople.get(0).getAmount();
        for (Salesperson s :
                salespeople) {
            if (max < s.getAmount()) {
                max=s.getAmount();
            }
            }
        for (Salesperson s :
                salespeople) {
            if(s.getAmount()==max){
                return s;
            }
        }
        return null;
    }

    public Salesperson selectSalesPersonWithFurthestAboveTarget(List<Salesperson> salespeople){
        int max=0;
        for (Salesperson s :
                salespeople) {
            if (s.getAmount() > s.getTarget()) {
                if(max<(s.getAmount()-s.getTarget())){
                    max=(s.getAmount()-s.getTarget());
                }
            }
        }
        for (Salesperson s :
                salespeople) {
            if (max==(s.getAmount()-s.getTarget())){
                return s;
            }
        }
        return null;
    }

    public Salesperson selectSalesPersonWithFurthestBelowTarget(List<Salesperson> salespeople){
        int min=new Sales().selectSalesPersonWithMaxSalesAmount(salespeople).getAmount();
        for (Salesperson s :
                salespeople) {
            if (s.getAmount() < s.getTarget()) {
                if(min>(s.getAmount()-s.getTarget())){
                    min=(s.getAmount()-s.getTarget());
                }
            }
        }
        for (Salesperson s :
                salespeople) {
            if (min==(s.getAmount()-s.getTarget())){
                return s;
            }
        }
        return null;
    }
}
