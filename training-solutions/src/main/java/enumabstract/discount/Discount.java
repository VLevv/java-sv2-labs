package enumabstract.discount;

public enum Discount {
    SPECIAL_OFFER{
        @Override
        double getAmountToPay(int price, int pieces) {
            return 0.8*pieces*price;
        }
    },BLACK_FRIDAY_OFFER{
        @Override
        double getAmountToPay(int price, int pieces) {
            if(pieces<3){
                return 0.75*pieces*price;
            }else {
                return 0.75*(pieces-1)*price+0.5*price;
            }
        }
    };

    abstract double getAmountToPay(int price,int pieces);
}
