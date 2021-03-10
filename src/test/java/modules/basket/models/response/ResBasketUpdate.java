package modules.basket.models.response;

import lombok.Data;
import modules.product.models.response.Promotion;

@Data
public class ResBasketUpdate {
    private boolean isPackage;
    private int totalPrice;
    private int basketCount;
    private int basketPackageCount;
    private Promotion promotion;

    public ResBasketUpdate() {
    }
}
