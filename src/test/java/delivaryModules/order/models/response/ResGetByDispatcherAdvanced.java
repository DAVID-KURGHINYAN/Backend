package delivaryModules.order.models.response;

import lombok.Data;
import modules.product.models.ProductModelForDispatcherAdvanced;
import modules.user.models.AddressModel;
import modules.user.models.CarrierModel;
import modules.user.models.ReceiverModel;

import java.util.List;

@Data
public class ResGetByDispatcherAdvanced {
    private int id;
    private int parentId;
    private String parentOrderId;
    private String orderId;
    private int status;
    private int paymentType;
    private int deliveryType;
    private String dateFrom;
    private String dateTo;
    private String createdDate;
    private int totalPrice;
    private String notes;
    private ReceiverModel receiver;
    private CarrierModel carrier;
    private CarrierModel parentCarrier;
    private List<ProductModelForDispatcherAdvanced> products;
    private List<AddressModel> addresses;
    private List<String> subOrders;
    private String phoneNumber;
    private String firstName;
    private String lastName;


    public ResGetByDispatcherAdvanced() {
    }
}
