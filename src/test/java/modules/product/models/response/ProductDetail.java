package modules.product.models.response;

import lombok.Data;

@Data
public class ProductDetail {
    private int productId;
    private String productTitle;
    private int percent;
    private int quantity;
    private String imagePath;
    private int bonus;
    private boolean isPackage;

    public ProductDetail() {
    }
}
