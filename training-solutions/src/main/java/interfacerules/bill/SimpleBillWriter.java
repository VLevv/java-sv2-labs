package interfacerules.bill;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SimpleBillWriter implements BillWriter{
    @Override
    public String writeBill(List<String> billItems) {
        List<Object> line;
        StringBuilder builder = new StringBuilder();
        for(int i = 0;i<billItems.size();++i){
            line = new ArrayList<>(Arrays.asList(billItems.get(i).split(";")));
            builder.append(line.get(0));
            builder.append(", ");
            builder.append(line.get(2));
            builder.append(" * ");
            builder.append(line.get(1));
            builder.append(" = ");
            builder.append(Integer.parseInt(line.get(1).toString())*Integer.parseInt(line.get(2).toString()));
            builder.append(" Ft");
            builder.append("\n");
        }
        return builder.toString();
    }
}
