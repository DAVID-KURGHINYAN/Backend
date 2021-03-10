package modules.product.models.response;

import lombok.Data;


@Data
public class Promotion {
    private int percent;
    private int result;
    private int promotionType;
    private GroupPromotion groupPromotion;
    private AvailablePromotion availablePromotions;

    public Promotion() {
    }
}