package modules.producer.models;

import lombok.Data;

@Data
public class IdNameProductsCount {
    private int id;
    private String name;
    private int productsCount;

    public IdNameProductsCount() {
    }
}
