package modules.product.models.response;

import lombok.Data;

import java.util.List;

@Data
public class ResSearchModel {
    private List<ProductList> products;
    private List<CategoriesList> categories;

    public ResSearchModel() {
    }
}
