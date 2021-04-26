package modules.pharmacyBranch.services;

import helpers.ResponseModel;
import helpers.enums.Roles;
import modules.pharmacyBranch.apis.PharmacyBranchApi;
import modules.pharmacyBranch.models.request.ReqPharmacyBranchList;
import modules.pharmacyBranch.models.response.ResPharmacyBranchList;
import org.junit.Assert;

public class PharmacyBranchService {
    private final PharmacyBranchApi pharmacyBranchApi;

    public PharmacyBranchService() {
        pharmacyBranchApi = new PharmacyBranchApi();
    }
    public void getPharmacyBranchList(){
        ReqPharmacyBranchList model = new ReqPharmacyBranchList();
        model.setPageNumber(1);
        model.setPageSize(10);
        ResponseModel<ResPharmacyBranchList> responseModel = pharmacyBranchApi.getPharmacyBranchList(model, Roles.Admin);
        Assert.assertEquals(responseModel.statusCode,200);
        System.out.println(responseModel.data.getList().get(0));
        System.out.println("OK");
    }
}
