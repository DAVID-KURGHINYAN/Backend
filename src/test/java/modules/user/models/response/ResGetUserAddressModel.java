package modules.user.models.response;

import lombok.Data;

@Data
public class ResGetUserAddressModel {
    private int id;
    private boolean isDefault;
    private String name;
    private String addressText;
    private int addressLat;
    private int addressLng;
    private String building;
    private String entrance;
    private String floor;
    private String apartment;
    private String comment;

    public ResGetUserAddressModel() {
    }
}
