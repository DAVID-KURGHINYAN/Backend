package modules.product.models.response;

import lombok.Data;

@Data
public class GroupPromotion {
    private int percent;
    private int result;
    private int promotionType;
    private int count;

    public GroupPromotion() {
    }
}