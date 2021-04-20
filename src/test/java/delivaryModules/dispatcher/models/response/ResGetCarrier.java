package delivaryModules.dispatcher.models.response;

import lombok.Data;

@Data
public class ResGetCarrier {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private double positionLat;
    private double positionLng;
    private String restoreKey;
    private int salary;

    public ResGetCarrier() {
    }
}
