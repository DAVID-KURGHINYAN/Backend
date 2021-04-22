package modules.order.services;

import helpers.BaseService;
import helpers.ResponseModel;
import helpers.enums.Roles;
import modules.order.apis.OrderApi;
import modules.order.models.request.ReqAdminListModel;
import modules.order.models.response.ResAdminList;
import modules.order.models.response.ResOrderDashboard;
import modules.product.services.ProductService;
import modules.user.models.AdminListModel;
import org.junit.Assert;

public class OrderService extends BaseService {
    private final OrderApi orderApi;
    private final delivaryModules.order.services.OrderService orderService;
    private final ProductService productService;

    public OrderService() {
        orderApi = new OrderApi();
        orderService = new delivaryModules.order.services.OrderService();
        productService = new ProductService();
    }

    public void getOrderAdminList() {
        ReqAdminListModel model = new ReqAdminListModel();
        model.setPageNumber(1);
        model.setPageSize(10);
        model.setStatus(1);

        ResponseModel<ResAdminList> responseModel = orderApi.orderAdminList(model, Roles.Admin);
        int size = responseModel.data.getList().size();
        Assert.assertTrue(responseModel.success);
        Assert.assertEquals(responseModel.statusCode, 200);
        for (int i = 0; i < size; i++) {
            AdminListModel adminListModel = responseModel.data.getList().get(i);
            int id = adminListModel.getId();
//            int status = adminListModel.getStatus();
//            int paymentType = adminListModel.getPaymentType();
            if (id==12318) {
               orderService.getByDispatcherAdvancedService();
               productService.getProductAvailabilityById();
                System.out.println(responseModel.data.getList().get(i));
            }
        }
    }
    public void getOrderDashboard() {
        ResponseModel<ResOrderDashboard> responseModel = orderApi.orderDashboard(Roles.Admin);
        Assert.assertEquals(responseModel.statusCode, 200);
        Assert.assertTrue(responseModel.success);
        System.out.println(responseModel.data.getTotalOrdersCount());
    }
}
