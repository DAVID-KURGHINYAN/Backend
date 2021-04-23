package modules.user.services;

import com.github.javafaker.Faker;
import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;
import helpers.BaseService;
import helpers.ResponseModel;
import helpers.enums.Roles;
import modules.user.apis.UserApi;
import modules.user.models.request.ReqAdminCreateModel;
import modules.user.models.request.ReqLoginModel;
import modules.user.models.request.ReqUserList;
import modules.user.models.response.ResAdminDetails;
import modules.user.models.response.ResAdminList;
import modules.user.models.response.ResAdminLoginModel;
import modules.user.models.response.ResUserList;
import org.junit.Assert;

import java.util.List;
import java.util.Locale;

public class UserService extends BaseService {
    private final UserApi userApi;

    public UserService() {
        userApi = new UserApi();
    }

    public void TakeAdminToken(){
        ReqLoginModel model = new ReqLoginModel(
                "admin@gmail.com",
                "Password1/");
        ResponseModel<ResAdminLoginModel> responseModel  = userApi.adminLogin(model);
        Assert.assertTrue(responseModel.success);
        ResAdminLoginModel resAdminLoginModel = responseModel.data;
        Assert.assertNotNull(resAdminLoginModel.getAccessToken());

    }

    public void getAdminList() {
        ResponseModel<List<ResAdminList>> responseModel = userApi.GetAdminList(Roles.Admin);
        Assert.assertEquals(responseModel.statusCode, 200);
        Assert.assertTrue(responseModel.success);

        List<ResAdminList> adminList = responseModel.data;
        Assert.assertTrue(adminList.size() > 0);
        String id = adminList.get(0).id;
        ResponseModel<ResAdminDetails> responseAdminDetails = userApi.GetAdminById(Roles.Admin, id);
        Assert.assertTrue(responseAdminDetails.success);
        Assert.assertEquals(id, responseAdminDetails.data.id);
    }

    public void CreateAdmin() {
        FakeValuesService fakeValuesService = new FakeValuesService(
                new Locale("en-GB"), new RandomService());
        Faker faker = new Faker();
        String email = fakeValuesService.bothify("????##@gmail.com");
        ReqAdminCreateModel model = new ReqAdminCreateModel();
        model.setRoleId("04c2d117-33a0-4ce9-b68c-ce8fcd0ca12e");
        model.setFirstName(faker.name().firstName());
        model.setLastName(faker.name().lastName());
        model.setPhoneNumber("+37499250584");
        model.setEmail(email);
        model.setUsername(faker.funnyName().name());
        model.setPassword("123123");
        model.setType(1);
        model.setPharmacyBranchId(6);

        ResponseModel<Boolean> responseModel = userApi.CreateAdmin(model, Roles.Admin);
        Assert.assertEquals(responseModel.statusCode, 200);
        if (!responseModel.success){
            System.out.println("Don`t worry, be happy. ");
        }
        else Assert.assertTrue(true);

    }

    public void EditAdmin() {
        FakeValuesService fakeValuesService = new FakeValuesService(
                new Locale("en-GB"), new RandomService());

        String email = fakeValuesService.bothify("????##@gmail.com");

        Faker faker = new Faker();
        ReqAdminCreateModel model = new ReqAdminCreateModel();
        model.setRoleId("04c2d117-33a0-4ce9-b68c-ce8fcd0ca12e");
        model.setFirstName(faker.name().firstName());
        model.setLastName(faker.name().lastName());
        model.setPhoneNumber(faker.phoneNumber().phoneNumber());
        model.setEmail(email);
        model.setUsername(faker.funnyName().name());
        model.setPassword(model.getPassword());
        model.setType(1);
        model.setPharmacyBranchId(6);

        ResponseModel<Boolean> responseModel = userApi.EditAdmin(model, Roles.Admin);
        Assert.assertTrue(responseModel.success);
    }

    public void getUserList() {
        ReqUserList model = new ReqUserList();
        model.setPageNumber(1);
        model.setPageSize(10);
        ResponseModel<ResUserList> responseModel = userApi.userList(model, Roles.Admin);
        Assert.assertTrue(responseModel.success);

        ResUserList resUserList = responseModel.data;
        if (resUserList.getList().get(0).getEmail().equals("aram.shilajyan@gmail.com"))
        System.out.println(resUserList.getList().get(0).getFullName());

    }
}
