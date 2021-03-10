package modules.product.models.request;

import helpers.Translation;
import lombok.Data;

import java.util.Arrays;
import java.util.List;

@Data
public class ReqProductCreateModel {
    private long unitId;
    private long brandId;
    private long producerId;
    private List<Integer> categoryIds;
    private List<Integer> activeIngredientIds;
    private double price;
    private int unitQuantity;
    private List<Translation> translations;

    public ReqProductCreateModel() {
    }
}

