package modules.producer.models.response;

import lombok.Data;
import modules.producer.models.IdNameProductsCount;

import java.util.List;

@Data
public class ResProducerList {
    private int pageCount;
    private int totalCount;
    private List<IdNameProductsCount> list;

    public ResProducerList() {
    }
}
