package modules.product.models;

import lombok.Data;

@Data
public class ProfessionList {
    private int id;
    private String name;
    private int doctorCount;

    public ProfessionList() {
    }
}
