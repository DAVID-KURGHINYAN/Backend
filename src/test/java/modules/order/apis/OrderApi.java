package modules.order.apis;

import com.google.gson.reflect.TypeToken;
import helpers.BaseApi;
import helpers.Response;
import helpers.ResponseModel;
import helpers.enums.Languages;
import helpers.enums.Roles;
import modules.order.models.request.ReqAdminListModel;
import modules.order.models.response.ResAdminListModel;
import modules.order.models.response.ResOrderDashboard;

import java.lang.reflect.Type;

public class OrderApi extends BaseApi {

    public ResponseModel<ResAdminListModel> orderAdminList(ReqAdminListModel model, Roles role) {
        String json = gson.toJson(model);
        Response response = networkManager.PostAdmin(json, getUrlOrderAdminList(role), "", Languages.hy, role);

        Type type = new TypeToken<ResponseModel<ResAdminListModel>>() {
        }.getType();
        ResponseModel<ResAdminListModel> responseModel = gson.fromJson(response.responseText,type);
        responseModel.statusCode = response.statusCode;
        return responseModel;
    }
    public ResponseModel<ResOrderDashboard> orderDashboard(Roles role) {
        Response response = networkManager.Get(getUriDashboard(role),"",Languages.hy,role);
        Type type = new TypeToken<ResponseModel<ResOrderDashboard>>(){}.getType();
        ResponseModel<ResOrderDashboard> responseModel = gson.fromJson(response.responseText,type);
        responseModel.statusCode= response.statusCode;
        return responseModel;
    }
}
