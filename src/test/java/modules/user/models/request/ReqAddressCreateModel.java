package modules.user.models.request;

import lombok.Data;

@Data
public class ReqAddressCreateModel {
    private String name;
    private String addressText;
    private int addressLat;
    private int addressLng;
    private String building;
    private String entrance;
    private String floor;
    private String apartment;
    private String comment;

    public ReqAddressCreateModel() {
    }
}
