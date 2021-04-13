package delivaryModules.dispatcher.models.request;

import lombok.Data;

@Data
public class ReqDispatcherGetCarrierList {
    private int pageNumber;
    private int pageSize;
//    private boolean descending;
    private String clientId;
    private String secret;
//    private String firstName;
//    private String lastName;
//    private String fullName;
//    private String email;
//    private String phoneNumber;
//    private int orderBy;

    public ReqDispatcherGetCarrierList() {
    }
}
