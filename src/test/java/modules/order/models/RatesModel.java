package modules.order.models;

import lombok.Data;

@Data
public class RatesModel {
    private int type;
    private int quality;
    private int speed;
    private int service;

    public RatesModel() {
    }
}
