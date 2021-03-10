package modules.product.models.response;

import helpers.Translations;
import lombok.Data;

@Data
public class ResGetActIngById {
private ActiveIngredientsList listModel;
private Translations translations;
}
