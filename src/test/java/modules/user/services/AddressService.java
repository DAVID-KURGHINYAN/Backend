package modules.user.services;

import helpers.BaseService;
import helpers.ResponseModel;
import helpers.enums.Roles;
import modules.user.apis.UserApi;
import modules.user.models.response.ResGetUserAddressModel;
import org.junit.Assert;

import java.util.List;

public class AddressService extends BaseService {
    private final UserApi userApi;

    public AddressService() {
        userApi = new UserApi();
    }

    public void getUserAddress() {
        ResponseModel<List<ResGetUserAddressModel>> responseModel = userApi.getUserAddress(Roles.Admin);
        Assert.assertEquals(responseModel.statusCode, 200);
        Assert.assertTrue(responseModel.success);
        Assert.assertEquals(responseModel.message, "Ok");

        List<ResGetUserAddressModel> userAddressList = responseModel.data;
//     Assert.assertFalse(userAddressList.isEmpty());
            int id1 = userAddressList.get(0).getId();
            String id = Integer.toString(id1);

        ResponseModel<ResGetUserAddressModel> userAddressById = userApi.getUserAddressById(Roles.Admin,id);
        Assert.assertEquals(userAddressList.get(0).getId(),15);
    }

}
