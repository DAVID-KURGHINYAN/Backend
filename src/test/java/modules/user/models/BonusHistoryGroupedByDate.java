package modules.user.models;

import lombok.Data;

import java.util.List;

@Data
public class BonusHistoryGroupedByDate {
    private int pageCount;
    private int totalCount;
    private List<DateBonusHistory> list;

    public BonusHistoryGroupedByDate() {
    }
}
