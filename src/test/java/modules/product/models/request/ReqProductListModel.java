package modules.product.models.request;

import lombok.Data;

import java.util.List;

@Data
public class ReqProductListModel {

    private int pageNumber;
    private int pageSize;
    private String productText;
    private List<Integer> brandIds;
    private List<Integer> producerIds;
    private List<Integer> activeIngredientIds;
    private int minPrice;
    private int maxPrice;
    private boolean hasDiscount;
    private List<Integer> categoryIds;
    private int sortBy;

    public ReqProductListModel() {
    }
}
