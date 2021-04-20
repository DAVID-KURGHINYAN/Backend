package delivaryModules.dispatcher.models.request;

import lombok.Data;

@Data
public class ReqGetCarrier {
    private int id;
    private String clientId;
    private String secret;

    public ReqGetCarrier() {
    }
}
