package helpers;

import lombok.Data;

@Data
public class Translation {
    private String languageCode;
    private String title;
    private String description;

    public Translation() {
    }
}
