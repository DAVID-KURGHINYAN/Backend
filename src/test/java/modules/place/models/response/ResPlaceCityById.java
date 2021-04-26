package modules.place.models.response;

import helpers.TranslationsModel;
import lombok.Data;

import java.util.List;

@Data
public class ResPlaceCityById {
    private int id;
    private String name;
    private List<TranslationsModel> translations;

    public ResPlaceCityById() {
    }
}
