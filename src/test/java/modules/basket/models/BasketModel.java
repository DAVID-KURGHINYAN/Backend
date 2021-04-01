package modules.basket.models;

import lombok.Data;
import modules.product.models.Promotion;

@Data
public class BasketModel {
    private int id;
    private String productUniqueId;
    private int productId;
    private String productPhoto;
    private int price;
    private int packagePrice;
    private int itemQuantity;
    private int totalPrice;
    private String unitName;
    private int unitQuantity;
    private int minCount;
    private int stepCount;
    private String productTitle;
    private int productQuantity;
    private boolean productStockQuantity;
    private boolean havePackage;
    private boolean isPackage;
    private int pointsUsage;
    private int prepaymentsUsage;
    private String producerName;
    private String productGroupName;
    private int discountedPrice;
    private int discountType;
    private Promotion promotion;
    private String uniqueId;

    public BasketModel() {
    }
}
