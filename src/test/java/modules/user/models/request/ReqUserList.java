package modules.user.models.request;

import lombok.Data;

@Data
public class ReqUserList {
    private int pageNumber;
    private int pageSize;
//    private String text;
//    private int status;
//    private String lastVisitFrom;
//    private String lastVisitTo;
//    private int orderAmountFrom;
//    private int orderAmountTo;

    public ReqUserList() {
    }
}
