package modules.product.models.response;

import helpers.Id_Name;
import helpers.Translation;
import lombok.Data;
import modules.product.models.Promotion;

import java.util.List;

@Data
public class ProductModel {
    private int id;
    private String uniqueId;
    private String title;
    private String description;
    private String unitName;
    private boolean stockQuantity;
    private int unitQuantity;
    private int price;
    private int packagePrice;
    private int requiredQuantityForDiscount;
    private int basketCount;
    private int basketPackageCount;
    private int minCount;
    private int stepCount;
    private boolean havePackage;
    private boolean isFavorite;
    private boolean isSpecial;
    private String createdDate;
    private Id_Name brand;
    private Producer producer;
    private Category category;
    private Promotion promotion;
    private Promotion packagePromotion;
    private List<ImageModel> images;
    private List<ActiveIngredientsList> activeIngredients;
    private List<Translation> translations;

    public ProductModel() {
    }
}
