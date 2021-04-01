package modules.order.models.response;

import lombok.Data;
import modules.order.models.DevicePercents;

@Data
public class ResOrderDashboard {
    private int totalOrdersCount;
    private int finishedOrdersCount;
    private int pendingOrdersCount;
    private int canceledOrdersCount;
    private int registeredUsersCount;
    private int activeUsersCount;
    private DevicePercents devicePercents;

    public ResOrderDashboard() {
    }
}
