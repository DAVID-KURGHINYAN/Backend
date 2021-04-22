package delivaryModules.order.services;

import com.google.gson.reflect.TypeToken;
import delivaryModules.order.apis.OrderApi;
import delivaryModules.order.models.request.ReqGetByDispatcherAdvanced;
import delivaryModules.order.models.response.ResGetByDispatcherAdvanced;
import helpers.BaseService;
import helpers.Response;
import helpers.ResponseModel;
import helpers.enums.Roles;
import org.junit.Assert;

import java.lang.reflect.Type;

public class OrderService extends BaseService {
    private final OrderApi orderApi;

    public OrderService(){
        orderApi = new OrderApi();
    }

    public void getByDispatcherAdvancedService(){
        ReqGetByDispatcherAdvanced model = new ReqGetByDispatcherAdvanced();
        model.setClientId("AlfaDispatcherClient");
        model.setSecret("Password1/");
        model.setOrderId("12318");
        ResponseModel<ResGetByDispatcherAdvanced> responseModel = orderApi.getByDispatcherAdvancedApi(model, Roles.Admin);
        Assert.assertEquals(responseModel.statusCode,200);
        System.out.println("getByDispatcherAdvanced is OK");

        ResGetByDispatcherAdvanced dispatcherAdvanced = responseModel.data;
        Assert.assertTrue(dispatcherAdvanced.getFirstName(), true);
    }
}
