package delivaryModules.dispatcher.apis;

import com.google.gson.reflect.TypeToken;
import delivaryModules.dispatcher.models.request.ReqDispatcherGetCarrierList;
import delivaryModules.dispatcher.models.request.ReqEditCarrier;
import delivaryModules.dispatcher.models.request.ReqGetCarrier;
import delivaryModules.dispatcher.models.response.ResDispatcherGetCarrierList;
import delivaryModules.dispatcher.models.response.ResGetCarrier;
import helpers.BaseApi;
import helpers.Response;
import helpers.ResponseModel;
import helpers.enums.Languages;
import helpers.enums.Roles;
import helpers.enums.Urls;

import java.lang.reflect.Type;

public class DispatcherApi extends BaseApi {
    public ResponseModel<ResDispatcherGetCarrierList> getCarrierListApi(ReqDispatcherGetCarrierList model, Roles role){
        String json = gson.toJson(model);
        Response response = networkManager.Post(json,getCarrierList(),"", Languages.hy, Urls.Delivery,role);
        Type type = new TypeToken<ResponseModel<ResDispatcherGetCarrierList>>(){}.getType();
        ResponseModel<ResDispatcherGetCarrierList> responseModel = gson.fromJson(response.responseText,type);
        responseModel.statusCode= response.statusCode;
        return responseModel;
    }

    public ResponseModel<ResGetCarrier> getCarrierApi(ReqGetCarrier model, Roles role) {
        String json = gson.toJson(model);
        Response response = networkManager.Post(json,getUriCarrier(role),"",Languages.hy,Urls.Delivery,role);
        Type type = new TypeToken<ResponseModel<ResGetCarrier>>(){}.getType();
        ResponseModel<ResGetCarrier> responseModel = gson.fromJson(response.responseText,type);
        responseModel.statusCode= response.statusCode;
        return responseModel;
    }
    public ResponseModel<Boolean> editCarrierApi(ReqEditCarrier model,Roles role) {
        String json = gson.toJson(model);
        Response response = networkManager.Post(json,getUriEditCarrier(role),"",Languages.hy,Urls.Delivery,role);
        Type type = new TypeToken<ResponseModel<Boolean>>(){}.getType();
        ResponseModel<Boolean> responseModel = gson.fromJson(response.responseText,type);
        responseModel.statusCode= response.statusCode;
        return responseModel;
    }
}
