package modules.product.models.response;

import lombok.Data;

import java.util.List;

@Data
public class ResProductCategoryModel {
    private int id;
    private String name;
    private int productsCount;
    private List<ProductList> products;

    public ResProductCategoryModel() {
    }
}
