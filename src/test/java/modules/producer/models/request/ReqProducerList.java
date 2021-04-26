package modules.producer.models.request;

import lombok.Data;

import java.util.List;

@Data
public class ReqProducerList {
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

    public ReqProducerList() {
    }
}
