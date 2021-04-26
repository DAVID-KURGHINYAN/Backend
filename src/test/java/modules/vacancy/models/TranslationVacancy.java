package modules.vacancy.models;

import lombok.Data;

@Data
public class TranslationVacancy {
   private String languageCode;
   private String name;
   private String description;

    public TranslationVacancy() {
    }
}
