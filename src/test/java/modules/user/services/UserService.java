package modules.user.services;

import helpers.ResponseModel;
import modules.user.apis.UserApi;
import modules.user.models.response.ResAdminDetails;
import modules.user.models.response.ResAdminList;
import org.junit.Assert;

import java.util.List;

public class UserService {
    private final UserApi userApi;

    public UserService() {
        userApi = new UserApi();
    }

    public void GetAdminsList() throws Exception {
        ResponseModel<List<ResAdminList>> responseModel = userApi.GetAdminList();
        if (responseModel.success) {
            List<ResAdminList> adminList = responseModel.data;
            Assert.assertTrue(adminList.size() > 0);
            String id = adminList.get(0).id;
            ResponseModel<ResAdminDetails> responseAdminDetails = userApi.GetAdminById(id);
            if (responseAdminDetails.success) {
                Assert.assertEquals(id, responseAdminDetails.data.id);
            } else throw new Exception(responseAdminDetails.message);

        } else throw new Exception(responseModel.message);
    }
}
