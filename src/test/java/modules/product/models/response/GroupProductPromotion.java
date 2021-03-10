package modules.product.models.response;

import lombok.Data;

import java.util.List;

@Data
public class GroupProductPromotion {
    private List<Product> products;
    private int totalBonus;
    private boolean isLocked;
    private int boundleId;
}
