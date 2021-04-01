package modules.user.models;

import lombok.Data;

@Data
public class ReceiverModel {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String bonusCardNumber;

    public ReceiverModel() {
    }
}
