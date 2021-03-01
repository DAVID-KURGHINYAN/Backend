package helpers;

import helpers.enums.Roles;
import modules.user.apis.UserApi;
import modules.user.models.request.ReqLoginModel;

public class TokenHelper {

    public static String getToken(Roles role) {
        UserApi userApi = new UserApi();

        if (role == Roles.Admin) {
            return userApi.Login(new ReqLoginModel(
                    "admin@gmail.com",
                    "Password1/"), role).data.accessToken;
        } else if (role == Roles.User) {
            return userApi.Login(new ReqLoginModel(
                    "+37494172839",
                    "taron123"), role).data.accessToken;
        } else if (role == Roles.BranchAdmin) {
            return userApi.Login(new ReqLoginModel(
                    "Alla_123",
                    "password"), role).data.accessToken;
        }
        return "";
    }
}