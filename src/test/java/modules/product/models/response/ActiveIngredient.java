package modules.product.models.response;

import lombok.Data;
import helpers.Id_Name;

@Data
public class ActiveIngredient {
    private Id_Name idName;

    public ActiveIngredient() {
    }
}
