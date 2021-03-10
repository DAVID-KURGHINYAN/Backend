package modules.product.models.response;

import lombok.Data;

import java.util.List;

@Data
public class AvailablePromotion {
    private List<PromotionQuantity> promotionQuantities;
    private List<GroupProductPromotion> groupProductPromotions;


    public AvailablePromotion() {
    }
}
