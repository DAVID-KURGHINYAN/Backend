package modules.user.models;

import lombok.Data;

@Data
public class BonusCardDetails {
    private String fullName;
    private int amount;
    private String cardNumber;

    public BonusCardDetails() {
    }
}
