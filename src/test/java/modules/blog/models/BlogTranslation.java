package modules.blog.models;

import lombok.Data;

@Data
public class BlogTranslation {
    private String languageCode;
    private String title;
    private String shortDescription;
    private String description;

    public BlogTranslation() {
    }
}
