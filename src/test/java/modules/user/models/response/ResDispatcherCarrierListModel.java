package modules.user.models.response;

import lombok.Data;
import modules.user.models.DispatcherDataModel;

@Data
public class ResDispatcherCarrierListModel {
    private int pageCount;
    private int totalCount;
    private DispatcherDataModel data;

    public ResDispatcherCarrierListModel() {
    }
}
