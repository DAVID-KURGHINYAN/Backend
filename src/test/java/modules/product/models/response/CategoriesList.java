package modules.product.models.response;

import lombok.Data;

import java.util.List;

@Data
public class CategoriesList {
    List<ActiveIngredient> categories;

    public CategoriesList() {
    }
}
