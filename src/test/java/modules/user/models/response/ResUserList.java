package modules.user.models.response;

import lombok.Data;
import modules.user.models.UserListModel;

import java.util.List;

@Data
public class ResUserList {
    private int pageCount;
    private int totalCount;
    private List<UserListModel> list;

    public ResUserList() {
    }
}
