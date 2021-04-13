package modules.order.apis;

import com.google.gson.reflect.TypeToken;
import helpers.BaseApi;
import helpers.Response;
import helpers.ResponseModel;
import helpers.enums.Languages;
import helpers.enums.Roles;
import helpers.enums.Urls;
import modules.order.models.request.ReqAdminListModel;
import modules.order.models.response.ResAdminList;
import modules.order.models.response.ResOrderDashboard;

import java.lang.reflect.Type;

public class OrderApi extends BaseApi {

    public ResponseModel<ResAdminList> orderAdminList(ReqAdminListModel model, Roles role) {
        String json = gson.toJson(model);
        Response response = networkManager.PostAdmin(json, getUrlOrderAdminList(role), "", Languages.hy,Urls.Back, role);

        Type type = new TypeToken<ResponseModel<ResAdminList>>() {
        }.getType();
        ResponseModel<ResAdminList> responseModel = gson.fromJson(response.responseText,type);
        responseModel.statusCode = response.statusCode;
        return responseModel;
    }
    public ResponseModel<ResOrderDashboard> orderDashboard(Roles role) {
        Response response = networkManager.Get(getUriDashboard(role),"",Languages.hy, Urls.Back,role);
        Type type = new TypeToken<ResponseModel<ResOrderDashboard>>(){}.getType();
        ResponseModel<ResOrderDashboard> responseModel = gson.fromJson(response.responseText,type);
        responseModel.statusCode= response.statusCode;
        return responseModel;
    }
}
