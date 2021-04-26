package modules.category.services;

import helpers.BaseService;
import helpers.ResponseModel;
import modules.category.apis.CategoryApi;
import modules.category.models.response.ResGetCategoryModel;
import org.junit.Assert;

import java.util.List;

public class CategoryService extends BaseService {
    private final CategoryApi categoryApi;

    public CategoryService(){categoryApi = new CategoryApi();}

    public void getCategory(){
        ResponseModel<List<ResGetCategoryModel>> responseModel = categoryApi.getCategory();
        Assert.assertEquals(responseModel.statusCode,200);
        Assert.assertTrue(responseModel.success);

        List<ResGetCategoryModel> models = responseModel.data;
        Assert.assertEquals(models.get(0).getName(),"Մանկական");
        System.out.println(models.get(0));
        System.out.println(models.get(1).getId());
        System.out.println(models.get(3).getId());

    }
}
