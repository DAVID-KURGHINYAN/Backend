package modules.basket.models.request;

import lombok.Data;

@Data
public class GetItemsByQuantityModel {
private int productId;
private boolean isPackage;
private int quantity;

    public GetItemsByQuantityModel() {
    }
}
