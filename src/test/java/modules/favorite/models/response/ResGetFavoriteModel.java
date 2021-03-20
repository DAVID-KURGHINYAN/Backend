package modules.favorite.models.response;

import lombok.Data;
import modules.product.models.Promotion;
@Data
public class ResGetFavoriteModel {

    private int id;
    private String uniqueId;
    private String title;
    private String unitName;
    private int unitQuantity;
    private int price;
    private Promotion promotion;
    private String imagePath;
    private int discount;
    private boolean isPackage;

    public ResGetFavoriteModel() {
    }
}
