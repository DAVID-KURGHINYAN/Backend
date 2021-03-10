package modules.basket.models.request;

import lombok.Data;

@Data
public class ReqEditBasketModel {
    private int productQuantity;
    private int productId;
    private boolean isPackage;

    public ReqEditBasketModel() {
    }
}
