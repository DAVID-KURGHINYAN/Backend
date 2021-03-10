package modules.product.models.response;

import lombok.Data;

import java.util.List;
@Data
public class Product {
   private List<ProductDetail> products;
    private int totalBonus;
    private boolean isLocked;
    private int boundleId;

    public Product() {
    }
}
