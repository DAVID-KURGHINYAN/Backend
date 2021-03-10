package modules.basket.models.request;

import lombok.Data;

import java.util.List;
@Data
public class ReqGetItemsByQuantity {

    private List<GetItemsByQuantityModel> list;

    public ReqGetItemsByQuantity() {
    }
}
