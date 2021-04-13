package modules.product.services;

import helpers.BaseService;
import helpers.ResponseModel;
import helpers.enums.Roles;
import modules.product.apis.ProductApi;
import modules.product.models.request.ReqProductListModel;
import modules.product.models.response.ResProductAvailabilityById;
import modules.product.models.response.ResProductList;
import org.junit.Assert;


public class ProductService extends BaseService {
    private final ProductApi productApi;

    public ProductService() {
        productApi = new ProductApi();
    }

    public void getProductList() {
        ReqProductListModel model = new ReqProductListModel();
        model.setPageNumber(1);
        model.setPageSize(1);
        ResponseModel<ResProductList> responseModel = productApi.getProductList(model,Roles.Admin);
        Assert.assertEquals(responseModel.statusCode, 200);
        Assert.assertTrue(responseModel.success);

        ResProductList productList = responseModel.data;
        Assert.assertTrue(productList.getList().size() > 0);
        int id = productList.getList().get(0).getId();
        String title = productList.getList().get(0).getTitle();
        System.out.println(id + " " + title);
    }
    public void getProductAvailabilityById(){
        ResponseModel<ResProductAvailabilityById> responseModel = productApi.getProductAvailability(Roles.Admin);
        Assert.assertEquals(responseModel.statusCode,200);
        Assert.assertTrue(responseModel.success);
        System.out.println("OK");
        ResProductAvailabilityById availability = responseModel.data;
        System.out.println(availability.getBranches().get(0).getContactPhoneNumber());
    }
}
