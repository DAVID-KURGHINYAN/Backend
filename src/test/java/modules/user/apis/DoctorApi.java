package modules.user.apis;

import com.google.gson.reflect.TypeToken;
import helpers.BaseApi;
import helpers.Response;
import helpers.ResponseModel;
import helpers.enums.Languages;
import helpers.enums.Roles;
import modules.user.models.request.ReqGetDoctorList;
import modules.user.models.response.ResGetDoctorList;

import java.lang.reflect.Type;

public class DoctorApi extends BaseApi {

    public ResponseModel<ResGetDoctorList> getDoctorList(ReqGetDoctorList model, Roles role){
        String json = gson.toJson(model);
        Response response = networkManager.Post(json,getUrlForDoctorList(),"", Languages.hy,role);
        Type type = new TypeToken<ResponseModel<ResGetDoctorList>>(){}.getType();
        ResponseModel<ResGetDoctorList> responseModel = gson.fromJson(response.responseText,type);
        responseModel.statusCode= response.statusCode;
        return responseModel;

    }
}
