package delivaryModules.dispatcher.models.response;

import lombok.Data;
import modules.user.models.DispatcherDataModel;

import java.util.List;

@Data
public class ResDispatcherGetCarrierList {
    private int pageCount;
    private int totalCount;
    private List<DispatcherDataModel> data;

    public ResDispatcherGetCarrierList() {
    }
}
