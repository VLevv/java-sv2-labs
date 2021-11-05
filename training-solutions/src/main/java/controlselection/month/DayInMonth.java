package controlselection.month;

    public class DayInMonth {
    public int days(int year,String month){
    switch (month){
        case("Február"):
            if((year%4==0)&&(year%100!=0||year%400==0)){
               return 29;
            }
            return 28;
        case("Április"):
        case("Június"):
        case("Szeptember"):
        case("November"):
            return 30;
        case("Január"):
        case("Március"):
        case("Május"):
        case("Július"):
        case("Augusztus"):
        case("Október"):
        case("December"):
            return 31;
        default:
            return 0;
        }
    }
}
