package delivaryModules.dispatcher.services;

import delivaryModules.dispatcher.apis.DispatcherApi;
import delivaryModules.dispatcher.models.request.ReqDispatcherGetCarrierList;
import delivaryModules.dispatcher.models.request.ReqGetCarrier;
import delivaryModules.dispatcher.models.response.ResDispatcherGetCarrierList;
import delivaryModules.dispatcher.models.response.ResGetCarrier;
import delivaryModules.order.models.request.ReqGetByDispatcherAdvanced;
import delivaryModules.order.models.response.ResGetByDispatcherAdvanced;
import helpers.ResponseModel;
import helpers.enums.Roles;
import org.junit.Assert;

public class DispatcherService {
    private final DispatcherApi dispatcherApi;

    public DispatcherService(){
        dispatcherApi = new DispatcherApi();
    }
    public void getCarrierListService(){
        ReqDispatcherGetCarrierList model = new ReqDispatcherGetCarrierList();
        model.setPageNumber(1);
        model.setPageSize(10);
        model.setClientId("AlfaDispatcherClient");
        model.setSecret("Password1/");
        ResponseModel<ResDispatcherGetCarrierList> responseModel = dispatcherApi.getCarrierListApi(model, Roles.Admin);
        Assert.assertEquals(responseModel.statusCode,200);

        ResDispatcherGetCarrierList getCarrierList = responseModel.data;
        Assert.assertTrue(getCarrierList.getData().size()>0);
        System.out.println("OK");
    }

    public void getCarrierService() {
        ReqGetCarrier model = new ReqGetCarrier();
        model.setId(141);
        model.setClientId("AlfaDispatcherClient");
        model.setSecret("Password1/");
        ResponseModel<ResGetCarrier> responseModel = dispatcherApi.getCarrierApi(model,Roles.Admin);
        Assert.assertEquals(responseModel.statusCode,200);

        ResGetCarrier resGetCarrier = responseModel.data;
        Assert.assertEquals(resGetCarrier.getFirstName(),"driver");
        System.out.println("OK");
    }
}
