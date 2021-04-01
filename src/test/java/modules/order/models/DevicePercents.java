package modules.order.models;

import lombok.Data;

@Data
public class DevicePercents {
    private int web;
    private int ios;
    private int android;

    public DevicePercents() {
    }
}
