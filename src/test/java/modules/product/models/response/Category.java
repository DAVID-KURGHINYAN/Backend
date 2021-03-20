package modules.product.models.response;

import lombok.Data;
import helpers.Id_Name;

@Data
public class Category {
    private Id_Name idName;

    public Category() {
    }
}
