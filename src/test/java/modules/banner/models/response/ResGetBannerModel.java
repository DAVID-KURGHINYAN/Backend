package modules.banner.models.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResGetBannerModel {
    private int id;
    private int type;
    private int dataId;
    private String title;
    private String description;
    private String photoPath;


    public ResGetBannerModel(int id, int type, int dataId, String title, String description, String photoPath) {
        this.id = id;
        this.type = type;
        this.dataId = dataId;
        this.title = title;
        this.description = description;
        this.photoPath = photoPath;
    }

    public ResGetBannerModel() {
    }
}
