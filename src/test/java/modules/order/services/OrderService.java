package modules.order.services;

import helpers.BaseService;
import helpers.ResponseModel;
import helpers.enums.Roles;
import modules.order.apis.OrderApi;
import modules.order.models.request.ReqAdminListModel;
import modules.order.models.response.ResAdminList;
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

        ResponseModel<ResAdminList> responseModel = orderApi.orderAdminList(model, Roles.Admin);
        int index = 0;
        int size = responseModel.data.getList().size();
        int status = responseModel.data.getList().get(index).getStatus();
        int paymentType = responseModel.data.getList().get(index).getPaymentType();

        Assert.assertTrue(responseModel.success);
        Assert.assertEquals(responseModel.statusCode, 200);
        for (index = 0; index < size; index++) {
            if (status == 1 && paymentType == 1) {
                System.out.println(responseModel.data.getList().get(index));
            } else System.out.println("There isn`t Post Terminal");
        }
    }
    public void getOrderDashboard() {
        ResponseModel<ResOrderDashboard> responseModel = orderApi.orderDashboard(Roles.Admin);
        Assert.assertEquals(responseModel.statusCode, 200);
        Assert.assertTrue(responseModel.success);
        System.out.println(responseModel.data.getTotalOrdersCount());
    }
}
