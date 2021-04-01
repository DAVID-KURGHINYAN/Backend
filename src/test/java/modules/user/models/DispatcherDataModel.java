package modules.user.models;

import lombok.Data;

@Data
public class DispatcherDataModel {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private double positionLat;
    private double positionLng;

    public DispatcherDataModel() {
    }
}
