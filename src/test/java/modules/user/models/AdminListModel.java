package modules.user.models;

import lombok.Data;

import java.io.Serializable;
import java.text.DateFormat;
import java.util.Date;

@Data
public class AdminListModel implements Serializable {
    private int id;
    private int status;
    private int paymentType;
    private int deliveryType;
    private String comment;
    private String createdDate;
    private UserModel user;
    private int productQuantity;
    private String address;
    private int totalBonus;
    private double totalPrice;
    private double subtotal;
    private int usedBonus;
    private int totalDiscountedPrice;
    private int deliveryFee;

    public AdminListModel() {
    }
}
