package modules.product.models.response;

import lombok.Data;

import java.util.List;


@Data
public class ResTopSalesModel {
    private List<TopSalesModel> topSalesModel;

    public ResTopSalesModel() {
    }
}
