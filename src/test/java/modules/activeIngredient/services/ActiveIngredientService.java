package modules.activeIngredient.services;

import helpers.ResponseModel;
import helpers.enums.Roles;
import modules.activeIngredient.apis.ActiveIngredientApi;
import modules.activeIngredient.models.request.ReqActiveIngredient;
import modules.activeIngredient.models.response.ResActiveIngredient;
import org.junit.Assert;

public class ActiveIngredientService {
    private final ActiveIngredientApi activeIngredientApi;

    public ActiveIngredientService(){
        activeIngredientApi = new ActiveIngredientApi();
    }
   public void getActiveIngredient(){
       ReqActiveIngredient model = new ReqActiveIngredient();
       model.setPageNumber(1);
       model.setPageSize(10);

       ResponseModel<ResActiveIngredient> responseModel = activeIngredientApi.getActiveIngredient(model, Roles.Admin);
       Assert.assertTrue(responseModel.success);
       System.out.println(responseModel.data.getList().get(0));
       System.out.println("OK");
   }
}
