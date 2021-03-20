package modules.user.services;

import helpers.BaseService;
import helpers.ResponseModel;
import helpers.enums.Roles;
import modules.user.apis.DoctorApi;
import modules.user.models.request.ReqGetDoctorList;
import modules.user.models.response.ResGetDoctorList;
import org.junit.Assert;

public class DoctorService extends BaseService {
    private final DoctorApi doctorApi;

    public DoctorService() {
        doctorApi = new DoctorApi();
    }

    public void GetDoctorList(){

        ReqGetDoctorList model = new ReqGetDoctorList();
        model.setPageNumber(10);
        model.setPageSize(1);

        ResponseModel<ResGetDoctorList> responseModel=doctorApi.getDoctorList(model, Roles.User);
        Assert.assertEquals(responseModel.statusCode,200);
        Assert.assertTrue(responseModel.success);
    }
}
