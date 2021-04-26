package modules.activeIngredient.models.response;

import lombok.Data;
import modules.producer.models.IdNameProductsCount;

import java.util.List;

@Data
public class ResActiveIngredient {
    private int pageCount;
    private int totalCount;
    private List<IdNameProductsCount> list;

    public ResActiveIngredient() {
    }
}
