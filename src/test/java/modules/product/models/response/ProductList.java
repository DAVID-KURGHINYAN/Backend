package modules.product.models.response;

import lombok.Data;

import java.util.List;

@Data
public class ProductList {
    private int id;
    private String uniqueId;
    private String title;
    private int price;
    private boolean isFavorite;
    private String imagePath;
    private Promotion promotion;
    private Producer producer;
    private Brand brand;
    private Category category;
    private List<ActiveIngredient> activeIngredients;

    public ProductList() {
    }
}
