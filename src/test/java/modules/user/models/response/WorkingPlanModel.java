package modules.user.models.response;

import lombok.Data;

@Data
public class WorkingPlanModel {
    private int startDay;
    private int endDay;
    private boolean isDayOff;
    private String startTime;
    private String endTime;

    public WorkingPlanModel() {
    }
}
