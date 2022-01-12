package excepionmulticatch.converter;

public class AnswerStat {
    private BinaryStringConverter converter;
    public AnswerStat(BinaryStringConverter converter){
        this.converter=converter;
    }

    public boolean[] convert(String string){
        try {
            return converter.binaryStringToBooleanArray(string);
        }catch (NullPointerException|IllegalArgumentException e){
            throw new InvalidBinaryStringException("Can not convert",e);
        }
    }

    public int answerTruePercent(String answers){
        boolean[] tmp = convert(answers);
        int c=0;
        for (boolean b :
                tmp) {
            if(b){
                c++;
            }
        }
        return c/tmp.length;
    }
}
