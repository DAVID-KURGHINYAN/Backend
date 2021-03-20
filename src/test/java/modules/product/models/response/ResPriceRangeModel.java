package modules.product.models.response;

import lombok.Data;

@Data
public class ResPriceRangeModel {
    private int min;
    private int max;

    public ResPriceRangeModel() {
    }
}
