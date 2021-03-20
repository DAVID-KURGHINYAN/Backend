package modules.product.models;

import lombok.Data;
import modules.product.models.response.AvailablePromotion;
import modules.product.models.response.GroupPromotion;


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