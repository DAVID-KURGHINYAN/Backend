package modules.order.models.response;

import lombok.Data;
import modules.user.models.AdminListModel;

import java.util.List;

@Data
public class ResOrderHistoryModel {
    private int pageCount;
    private int totalCount;
    private List<AdminListModel> list;

    public ResOrderHistoryModel() {
    }
}
