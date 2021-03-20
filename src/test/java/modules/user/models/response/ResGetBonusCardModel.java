package modules.user.models.response;

import lombok.Data;

@Data
public class ResGetBonusCardModel {
    private String link;
    private int inviteCount;
    private int bonusCount;

    public ResGetBonusCardModel() {
    }
}
