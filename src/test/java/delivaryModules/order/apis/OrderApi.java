package delivaryModules.order.apis;

import com.google.gson.reflect.TypeToken;
import delivaryModules.order.models.request.ReqGetByDispatcherAdvanced;
import delivaryModules.order.models.response.ResGetByDispatcherAdvanced;
import helpers.BaseApi;
import helpers.Response;
import helpers.ResponseModel;
import helpers.enums.Languages;
import helpers.enums.Roles;
import helpers.enums.Urls;

import java.lang.reflect.Type;

public class OrderApi extends BaseApi {
    public ResponseModel<ResGetByDispatcherAdvanced> dispatcherAdvanced(ReqGetByDispatcherAdvanced model, Roles role) {
        String json = gson.toJson(model);
        Response response = networkManager.Post(json,getUriGetByDispatcherAdvanced(role),"", Languages.hy, Urls.Back,role);
        Type type  = new TypeToken<ResponseModel<ResGetByDispatcherAdvanced>>(){}.getType();
        ResponseModel<ResGetByDispatcherAdvanced> responseModel = gson.fromJson(response.responseText,type);
        responseModel.statusCode= response.statusCode;
        return responseModel;
    }
}
