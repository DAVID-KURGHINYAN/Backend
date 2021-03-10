package modules.product.models.response;

import lombok.Data;

@Data
public class PromotionQuantity {
    private int percent;
    private int result;
    private int promotionType;
    private String description;

    public PromotionQuantity() {
    }
}
