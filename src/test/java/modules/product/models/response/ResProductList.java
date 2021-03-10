package modules.product.models.response;

import lombok.Data;

import java.util.List;

@Data
public class ResProductList {
    private Integer pageCount;
    private Integer totalCount;
    private List<ResProductListList> list;

    public ResProductList() {
    }
}

