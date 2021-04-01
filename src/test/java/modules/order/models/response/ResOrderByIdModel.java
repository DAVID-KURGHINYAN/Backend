package modules.order.models.response;

import helpers.Id_Name;
import lombok.Data;
import modules.basket.models.BasketModel;
import modules.user.models.UserModel;
import modules.order.models.RatesModel;

import java.util.Date;
import java.util.List;

@Data
public class ResOrderByIdModel {
    private int id;
    private int status;
    private int paymentType;
    private int deliveryType;
    private String comment;
    private Date createdDate;
    private UserModel user;
    private int productQuantity;
    private String address;
    private int totalBonus;
    private int totalPrice;
    private int subtotal;
    private int usedBonus;
    private int totalDiscountedPrice;
    private int deliveryFee;
    private String fullName;
    private String phone;
    private String creditCardPan;
    private Date deliveryDate;
    private List<RatesModel> rates;
    private List<BasketModel> baskets;
    private Id_Name pickupBranch;
    private String floor;
    private String entrance;
    private String appartment;
    private String building;
    private String addressText;

    public ResOrderByIdModel() {
    }
}
