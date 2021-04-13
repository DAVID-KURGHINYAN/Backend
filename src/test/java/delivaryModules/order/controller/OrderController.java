package delivaryModules.order.controller;

import delivaryModules.order.services.OrderService;
import org.junit.Test;

public class OrderController {
    private final OrderService orderService;

    public OrderController(){
        orderService = new OrderService();
    }
    @Test
    public void getByDispatcherAdvanced(){
        orderService.getByDispatcherAdvancedService();
    }
}
