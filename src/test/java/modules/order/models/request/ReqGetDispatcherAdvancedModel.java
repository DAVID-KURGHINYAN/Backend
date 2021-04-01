package modules.order.models.request;

import lombok.Data;

@Data
public class ReqGetDispatcherAdvancedModel {
    private String clientId;
    private String secret;
    private String orderId;

    public ReqGetDispatcherAdvancedModel() {
    }
}
