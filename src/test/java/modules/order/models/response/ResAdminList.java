package modules.order.models.response;

import lombok.Data;
import modules.user.models.AdminListModel;

import java.util.List;

@Data
public class ResAdminList {
    private int pageCount;
    private int totalCount;
    private List<AdminListModel> list;

    public ResAdminList() {
    }

}
