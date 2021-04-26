package modules.place.apis;

import com.google.gson.reflect.TypeToken;
import helpers.BaseApi;
import helpers.Response;
import helpers.ResponseModel;
import helpers.enums.Languages;
import helpers.enums.Roles;
import helpers.enums.Urls;
import modules.place.models.response.ResPlaceCityById;

import java.lang.reflect.Type;

public class PlaceApi extends BaseApi {
    public ResponseModel<ResPlaceCityById> getPlaceCityById(Roles role){
        Response response = networkManager.Get(getUriPlaceCityById(role),"139", Languages.hy, Urls.Back,role);
        Type type = new TypeToken<ResponseModel<ResPlaceCityById>>(){}.getType();
        ResponseModel<ResPlaceCityById> responseModel = gson.fromJson(response.responseText,type);
        responseModel.statusCode= response.statusCode;
        return responseModel;
    }
}
