package modules.order.models.request;

import lombok.Data;

@Data
public class ReqAdminListModel {
    private int pageNumber;
    private int pageSize;
//    private String text;
    private int status;
//    private String dateFrom;
//    private String dateTo;
//    private int priceFrom;
//    private int priceTo;

    public ReqAdminListModel() {
    }
}
