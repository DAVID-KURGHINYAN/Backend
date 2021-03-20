package modules.product.models.response;

import lombok.Data;
import helpers.Id_Name;

@Data
public class ActiveIngredientsList {
    private Id_Name activeIngredients;
    private int productsCount;

    public ActiveIngredientsList() {
    }
}
