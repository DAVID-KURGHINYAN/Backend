package modules.pharmacyBranch.models.response;

import lombok.Data;
import modules.product.models.BranchModel;

import java.util.List;

@Data
public class ResPharmacyBranchList {
    private int pageCount;
    private int totalCount;
    private List<BranchModel> list;

    public ResPharmacyBranchList() {
    }
}
