package enumtype.firstenum;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class FirstEnumMain {
    public static void main(String[] args) {
        System.out.println(Continent.AFRIKA);
        System.out.println(Continent.ANTARKTIISZ);
        System.out.println(Continent.AUSZTRÁLIA);
        System.out.println(Continent.ÉSZAKAMERIKA);
        System.out.println(Continent.DÉLAMERIKA);
        System.out.println(Continent.EURÓPA);
        System.out.println(Continent.ÁZSIA);
        for (Continent s:Continent.values()){
            System.out.print(s+", ");
        }
        System.out.println();
        System.out.println(Oceans.valueOf("CSENDES"));
        System.out.println(Oceans.valueOf("JEGESTENGER"));
        System.out.println(Oceans.valueOf("ATLANTI"));
        System.out.println(Oceans.valueOf("INDIAI"));
        Football football = Football.CSATÁR;
        System.out.println(football.name());
        football = Football.HÁTVÉD;
        System.out.println(football.name());
        football = Football.SZÉLSŐ;
        System.out.println(football.name());
        football = Football.KAPUS;
        System.out.println(football.name());
        football = Football.KÖZÉPPÁJÁS;
        System.out.println(football.name());
    }
}
