package delivaryModules.order.services;

import delivaryModules.order.apis.OrderApi;
import helpers.BaseService;

public class OrderService extends BaseService {
    private final OrderApi orderApi;

    public OrderService(){
        orderApi = new OrderApi();
    }

    //dispatcherAdvanced()
}
