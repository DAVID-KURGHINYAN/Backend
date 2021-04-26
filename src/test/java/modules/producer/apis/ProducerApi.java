package modules.producer.apis;

import com.google.gson.reflect.TypeToken;
import helpers.BaseApi;
import helpers.Response;
import helpers.ResponseModel;
import helpers.enums.Languages;
import helpers.enums.Roles;
import helpers.enums.Urls;
import modules.producer.models.request.ReqProducerList;
import modules.producer.models.response.ResProducerList;

import java.lang.reflect.Type;

public class ProducerApi extends BaseApi {

    public ResponseModel<ResProducerList> getProducerList(ReqProducerList model, Roles role){
        String json = gson.toJson(model);
        Response response = networkManager.Post(json,getUriProducerList(role),"", Languages.hy, Urls.Back,role);
        Type type = new TypeToken<ResponseModel<ResProducerList>>(){}.getType();
        ResponseModel<ResProducerList> responseModel = gson.fromJson(response.responseText,type);
        responseModel.statusCode= response.statusCode;
        return responseModel;
    }
}
