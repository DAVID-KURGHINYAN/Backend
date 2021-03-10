package modules.user.models.request;

import lombok.Data;

@Data
public class ReqGetDoctorList {
    private int pageNumber;
    private int pageSize;
    private String text;
    private int serviceId;

    public ReqGetDoctorList() {
    }
}
