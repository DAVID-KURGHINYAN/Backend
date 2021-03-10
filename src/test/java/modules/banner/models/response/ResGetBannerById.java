package modules.banner.models.response;

import helpers.Translation;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class ResGetBannerById extends ResGetBannerModel{
    private List<Translation> translations;

    public ResGetBannerById(int id, int type, int dataId, String title, String description, String photoPath, List<Translation> translations) {
        super(id, type, dataId, title, description, photoPath);
        this.translations = translations;
    }

    public ResGetBannerById() {
    }
}