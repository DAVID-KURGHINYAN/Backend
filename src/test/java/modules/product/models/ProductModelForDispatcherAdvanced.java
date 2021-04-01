package modules.product.models;

import lombok.Data;

@Data
public class ProductModelForDispatcherAdvanced {
    private int id;
    private String productId;
    private String name;
    private String productPhoto;
    private int quantity;
    private int residue;
    private String unit;
    private int price;
    private int totalPrice;
    private boolean isPackage;

    public ProductModelForDispatcherAdvanced() {
    }
}
