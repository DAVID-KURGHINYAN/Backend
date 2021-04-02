package delivaryModules.order.models.request;

import lombok.Data;

@Data
public class ReqGetByDispatcherAdvanced {
    private String clientId;
    private String secret;
    private String orderId;

    public ReqGetByDispatcherAdvanced() {
    }
}
