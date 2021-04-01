package modules.user.models;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class AdminListModel implements Serializable {
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

    public AdminListModel() {
    }
}
