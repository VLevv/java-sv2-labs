package defaultconstructor.simpledate;

public class SimpleDateFormatter {
    public SimpleDateFormatter() {
    }

    public String formatDateString(SimpleDate simpleDate){
        StringBuilder builder = new StringBuilder();
        builder.append(simpleDate.getYear());
        builder.append("-");
        builder.append(simpleDate.getMonth());
        builder.append("-");
        builder.append(simpleDate.getDay());
        return builder.toString();
    }

    public String formatDateStringByCountryCode(CountryCode countryCode, SimpleDate simpleDate){
        StringBuilder builder = new StringBuilder();
        if(countryCode.equals(CountryCode.HU)){
            return formatDateString(simpleDate);
        }
        if(countryCode.equals(CountryCode.US)){
            builder.append(simpleDate.getDay());
            builder.append("-");
            builder.append(simpleDate.getMonth());
        }
        if(countryCode.equals(CountryCode.EN)){
            builder.append(simpleDate.getMonth());
            builder.append("-");
            builder.append(simpleDate.getDay());
        }
        builder.append("-");
        builder.append(simpleDate.getYear());
        return builder.toString();
    }

}
