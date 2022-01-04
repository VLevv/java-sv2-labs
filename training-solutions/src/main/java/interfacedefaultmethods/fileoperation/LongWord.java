package interfacedefaultmethods.fileoperation;

import java.nio.file.Paths;
import java.util.List;

public class LongWord implements FileOperations{
    @Override
    public String getLongWord() {
        List<String> lines  = readFromFile(Paths.get("src/test/resources/longword.txt"));
        StringBuilder builder = new StringBuilder();
        for (String s :
                lines) {
            if (s.equals(lines.get(0))){
                builder.append(s);
            }else{
                builder.append(s.substring(s.length()-1));
            }
        }
        return builder.toString();
    }
}
