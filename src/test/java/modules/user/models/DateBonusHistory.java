package modules.user.models;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class DateBonusHistory {
    private Date date;
    private List<BonusHistory> bonusHistory;

    public DateBonusHistory() {
    }
}
