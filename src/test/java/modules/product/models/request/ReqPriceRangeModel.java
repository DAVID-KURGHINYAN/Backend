package modules.product.models.request;

import lombok.Data;

import java.util.List;

@Data
public class ReqPriceRangeModel {
    private String productText;
    private List<Integer> brandIds;
    private List<Integer> producerIds;
    private List<Integer> activeIngredientIds;
    private int minPrice;
    private int maxPrice;
    private boolean hasDiscount;
    private List<Integer> categoryIds;

 public ReqPriceRangeModel() {
 }
}
