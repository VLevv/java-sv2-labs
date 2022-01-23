package clone.timesheet;

import java.time.LocalDateTime;

public class TimeSheetItem {
    private String employee;
    private String project;
    private LocalDateTime from;
    private LocalDateTime to;

    public TimeSheetItem(String employee, String project, LocalDateTime from, LocalDateTime to) {
        this.employee = employee;
        this.project = project;
        this.from = from;
        this.to = to;
    }

    public TimeSheetItem(TimeSheetItem item) {
        employee=item.employee;
        project=item.project;
        from=item.from;
        to=item.to;
    }

    public TimeSheetItem copyWithDifferentEmployee(TimeSheetItem timeSheetItem,String newEmployee){
        TimeSheetItem ret = new TimeSheetItem(timeSheetItem);
        ret.employee=newEmployee;
        return ret;
    }
}
