package modules.order.controllers;

import modules.order.services.OrderService;
import org.junit.Test;

public class OrderController {
    private final OrderService orderService;

    public OrderController(){
        orderService=new OrderService();
    }
    @Test
    public void adminListSuccessCase(){
        orderService.getOrderAdminList();
    }
    @Test
    public void orderDashboardSuccessCase(){
        orderService.getOrderDashboard();
    }
}
