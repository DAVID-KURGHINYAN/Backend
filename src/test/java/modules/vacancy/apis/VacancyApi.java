package modules.vacancy.apis;

import com.google.gson.reflect.TypeToken;
import helpers.BaseApi;
import helpers.Response;
import helpers.ResponseModel;
import helpers.enums.Languages;
import helpers.enums.Roles;
import helpers.enums.Urls;
import modules.vacancy.models.response.ResVacancyById;

import java.lang.reflect.Type;

public class VacancyApi extends BaseApi {
    public ResponseModel<ResVacancyById> getVacancyById(Roles role) {
        Response response = networkManager.Get(getUriVacancyById(role),"4", Languages.hy, Urls.Back,role); //param=4,8,10,11
        Type type = new TypeToken<ResponseModel<ResVacancyById>>(){}.getType();
        ResponseModel<ResVacancyById> responseModel = gson.fromJson(response.responseText,type);
       responseModel.statusCode= response.statusCode;
       return responseModel;
    }
}
