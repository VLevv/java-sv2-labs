package methodvarargs.examstats;

public class ExamStats {
    private int maxPoint;

    public ExamStats(int maxPoint) {
        this.maxPoint = maxPoint;
    }

    public int getNumberOfTopGrades(int limitInPercent,int... results){
        int c = 0;
        if(results==new int[0]){
            throw new IllegalArgumentException("Missing result numbers");
        }
        for (int i :
                results) {
            if (i >= (maxPoint * limitInPercent / 100)) {
                ++c;
            }
        }
        return c;
    }

    public boolean hasAnyFailed(int limitInPercent, int... results){
        if(results==new int[0]){
            throw new IllegalArgumentException("Missing result numbers");
        }
        for (int i :
                results) {
            if (i < (maxPoint * limitInPercent / 100)) {
                return true;
            }
        }
        return false;
    }

}
