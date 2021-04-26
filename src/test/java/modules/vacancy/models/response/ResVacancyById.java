package modules.vacancy.models.response;

import lombok.Data;
import modules.vacancy.models.TranslationVacancy;

import java.util.List;

@Data
public class ResVacancyById {
    private int id;
    private String name;
    private String description;
    private List<TranslationVacancy> translations;

    public ResVacancyById() {
    }
}
