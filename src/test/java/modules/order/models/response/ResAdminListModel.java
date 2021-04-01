package modules.order.models.response;

import lombok.Data;
import modules.user.models.AdminListModel;

import java.util.ArrayList;

@Data
public class ResAdminListModel {
    private int pageCount;
    private int totalCount;
    private ArrayList<AdminListModel> list;

    public ResAdminListModel() {
    }

}
