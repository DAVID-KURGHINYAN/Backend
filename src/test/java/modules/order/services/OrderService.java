package modules.order.services;

import helpers.BaseService;
import helpers.ResponseModel;
import helpers.enums.Roles;
import modules.order.apis.OrderApi;
import modules.order.models.request.ReqAdminListModel;
import modules.order.models.response.ResAdminListModel;
import modules.order.models.response.ResOrderDashboard;
import org.junit.Assert;

public class OrderService extends BaseService {
    private final OrderApi orderApi;

    public OrderService() {
        orderApi = new OrderApi();
    }

    public void GetOrderAdminList() {
        ReqAdminListModel model = new ReqAdminListModel();
        model.setPageNumber(1);
        model.setPageSize(10);
        model.setStatus(1);
        ResponseModel<ResAdminListModel> responseModel = orderApi.orderAdminList(model, Roles.Admin);
        Assert.assertTrue(responseModel.success);
        Assert.assertEquals(responseModel.statusCode, 200);
//        for (int i = 0; i <responseModel.data.getList().size() ; i++) {
//            if (responseModel.data.getList().get(i).getPaymentType()==1){
//                System.out.println(responseModel);
//            }
//            else System.out.println("There isn`t Post Terminal");
//        }
        System.out.println(responseModel);
    }

    public void getOrderDashboard(){
        ResponseModel<ResOrderDashboard> responseModel = orderApi.orderDashboard(Roles.Admin);
        Assert.assertEquals(responseModel.statusCode,200);
        Assert.assertTrue(responseModel.success);
        System.out.println(responseModel);
    }
}
