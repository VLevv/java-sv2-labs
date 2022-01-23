package collectionsclass.result;

import java.util.Comparator;

public class ExamResult implements Comparable<ExamResult> {
    private String name;
    private Integer points;

    public ExamResult(String name, int points) {
        this.name = name;
        this.points = points;
    }

    public Integer getPoints() {
        return points;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(ExamResult o) {
        return points.compareTo(o.getPoints());
    }
}
