package modules.brand.services;

import helpers.BaseService;
import helpers.ResponseModel;
import helpers.enums.Roles;
import modules.brand.apis.BrandApi;
import modules.brand.models.request.ReqBrandList;
import modules.brand.models.response.ResBrandList;
import org.junit.Assert;

public class BrandService extends BaseService {
    private final BrandApi brandApi;

    public BrandService(){
        brandApi = new BrandApi();
    }

    public void getBrandList(){
        ReqBrandList model = new ReqBrandList();
        model.setPageNumber(1);
        model.setPageSize(10);

        ResponseModel<ResBrandList> responseModel = brandApi.getBrandList(model, Roles.Admin);
        Assert.assertTrue(responseModel.success);
        System.out.println(responseModel.data.getList().get(0));
        System.out.println("OK");
    }
}
