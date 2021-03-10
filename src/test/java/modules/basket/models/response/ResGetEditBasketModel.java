package modules.basket.models.response;

import lombok.Data;
import modules.basket.models.request.ItemsListModel;

import java.util.List;

@Data
public class ResGetEditBasketModel {
    private int totalBonus;
    private int totalPrice;
    private int totalDiscountedPrice;
    private List<ItemsListModel> items;

    public ResGetEditBasketModel() {
    }
}
