package modules.pharmacyBranch.apis;

import com.google.gson.reflect.TypeToken;
import helpers.BaseApi;
import helpers.Response;
import helpers.ResponseModel;
import helpers.enums.Languages;
import helpers.enums.Roles;
import helpers.enums.Urls;
import modules.pharmacyBranch.models.request.ReqPharmacyBranchList;
import modules.pharmacyBranch.models.response.ResPharmacyBranchList;

import java.lang.reflect.Type;

public class PharmacyBranchApi extends BaseApi {
    public ResponseModel<ResPharmacyBranchList> getPharmacyBranchList(ReqPharmacyBranchList model, Roles role){
        String json = gson.toJson(model);
        Response response = networkManager.Post(json,getUriPharmacyBranchList(role),"", Languages.hy, Urls.Back,role);
        Type type = new TypeToken<ResponseModel<ResPharmacyBranchList>>(){}.getType();
        ResponseModel<ResPharmacyBranchList> responseModel = gson.fromJson(response.responseText,type);
        responseModel.statusCode= response.statusCode;
        return responseModel;
    }

}
