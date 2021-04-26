package modules.brand.models.request;

import lombok.Data;

import java.util.List;

@Data
public class ReqBrandList {
    private int pageNumber;
    private int pageSize;
//    private String text;
//    private String productText;
//    private List<Integer> activeIngredientIds;
//    private List<Integer> brandIds;
//    private int minPrice;
//    private int maxPrice;
//    private boolean hasDiscount;
//    private int categoryId;

    public ReqBrandList() {
    }
}
