package modules.product.models.response;

import lombok.Data;

import java.util.List;

@Data
public class ResActiveIngredientModel {
    private int pageCount;
    private int totalCount;
    private List<ActiveIngredientsList> list;

    public ResActiveIngredientModel() {
    }
}
