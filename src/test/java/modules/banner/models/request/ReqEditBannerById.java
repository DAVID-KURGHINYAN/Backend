package modules.banner.models.request;

import helpers.Translation;
import lombok.Data;

import java.util.List;

@Data
public class ReqEditBannerById {
    private int type;
    private int dataId;
    private List<Translation> translations;

    public ReqEditBannerById() {
    }
}
