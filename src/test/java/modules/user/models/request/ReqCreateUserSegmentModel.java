package modules.user.models.request;

import lombok.Data;

import java.util.Date;

@Data
public class ReqCreateUserSegmentModel {
    private String filterText;
    private int filterStatus;
    private Date filterLastVisitFrom;
    private Date filterLastVisitTo;
    private Date filterOrderAmountFrom;
    private Date filterOrderAmountTo;
    private String name;
    private boolean hiddenOnList;

    public ReqCreateUserSegmentModel() {
    }
}
