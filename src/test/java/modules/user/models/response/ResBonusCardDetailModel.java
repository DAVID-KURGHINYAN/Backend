package modules.user.models.response;

import lombok.Data;
import modules.user.models.BonusCardDetails;
import modules.user.models.BonusHistoryGroupedByDate;

@Data
public class ResBonusCardDetailModel {
    private BonusCardDetails bonusCardDetails;
    private BonusHistoryGroupedByDate bonusHistoryGroupedByDate;

    public ResBonusCardDetailModel() {
    }
}
