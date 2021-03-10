package modules.basket.models.request;

import lombok.Data;
import modules.product.models.response.Promotion;

@Data
public class ItemsListModel {
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
    private Promotion promotion;
    private String uniqueId;

    public ItemsListModel() {
    }
}
