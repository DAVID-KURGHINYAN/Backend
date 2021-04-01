package modules.order.models.response;

import lombok.Data;
import modules.product.models.ProductModelForDispatcherAdvanced;
import modules.user.models.AddressModel;
import modules.user.models.CarrierModel;
import modules.user.models.ReceiverModel;

import java.util.Date;
import java.util.List;

@Data
public class ResGetDispatcherAdvancedModel {
    private int id;
    private int parentId;
    private String parentOrderId;
    private String orderId;
    private int status;
    private int paymentType;
    private int deliveryType;
    private Date dateFrom;
    private Date dateTo;
    private Date createdDate;
    private int totalPrice;
    private String notes;
    private ReceiverModel receiver;
    private CarrierModel carrier;
    private CarrierModel parentCarrier;
    private ProductModelForDispatcherAdvanced products;
    private List<AddressModel> addresses;
    private List<String> subOrders;
    private String phoneNumber;
    private String firstName;
    private String lastName;


    public ResGetDispatcherAdvancedModel() {
    }
}
