package modules.user.models;

import lombok.Data;

@Data
public class AddressModel {
    private int id;
    private String addressId;
    private String name;
    private int type;
    private double lat;
    private double lng;

    public AddressModel() {
    }
}
