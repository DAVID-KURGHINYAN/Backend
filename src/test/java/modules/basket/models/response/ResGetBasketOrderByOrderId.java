package modules.basket.models.response;

import lombok.Data;
import modules.basket.models.request.ItemsListModel;

import java.util.List;

@Data
public class ResGetBasketOrderByOrderId {
    private List<ItemsListModel> itemList;

    public ResGetBasketOrderByOrderId() {
    }
}
