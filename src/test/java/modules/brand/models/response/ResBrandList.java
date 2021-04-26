package modules.brand.models.response;

import lombok.Data;
import modules.producer.models.IdNameProductsCount;

import java.util.List;

@Data
public class ResBrandList {
    private int pageCount;
    private int totalCount;
    private List<IdNameProductsCount> list;

    public ResBrandList() {
    }
}
