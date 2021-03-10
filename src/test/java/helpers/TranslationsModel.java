package helpers;

import lombok.Data;

@Data
public class TranslationsModel {
    private String languageCode;
    private String name;

    public TranslationsModel() {
    }
}
