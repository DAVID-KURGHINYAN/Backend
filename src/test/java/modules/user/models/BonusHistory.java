package modules.user.models;

import lombok.Data;

import java.util.Date;

@Data
public class BonusHistory {
    private int id;
    private int orderId;
    private int amount;
    private int bonus;
    private int status;
    private Date date;

    public BonusHistory() {
    }
}
