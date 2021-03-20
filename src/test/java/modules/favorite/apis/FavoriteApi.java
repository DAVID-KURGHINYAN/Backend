package modules.favorite.apis;

import com.google.gson.reflect.TypeToken;
import helpers.BaseApi;
import helpers.Response;
import helpers.ResponseModel;
import helpers.enums.Languages;
import helpers.enums.Roles;
import modules.favorite.models.response.ResGetFavoriteModel;

import java.lang.reflect.Type;
import java.util.List;

public class FavoriteApi extends BaseApi {

    public ResponseModel<List<ResGetFavoriteModel>> getFavoriteList(Roles role){
        Response response = networkManager.Get("/api/Favorite","", Languages.hy,role);
        Type type = new TypeToken<ResponseModel<List<ResGetFavoriteModel>>>(){}.getType();
        ResponseModel<List<ResGetFavoriteModel>> responseModel = gson.fromJson(response.responseText,type);
        responseModel.statusCode= response.statusCode;
        return responseModel;

    }

}
