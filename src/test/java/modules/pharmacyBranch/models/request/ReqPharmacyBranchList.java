package modules.pharmacyBranch.models.request;

import lombok.Data;

@Data
public class ReqPharmacyBranchList {
    private int pageNumber;
    private int pageSize;
//    private String text;
//    private String storeId;
//    private double lat;
//    private double lng;

    public ReqPharmacyBranchList() {
    }
}
