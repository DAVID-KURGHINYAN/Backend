package modules.blog.models.response;

import lombok.Data;
import modules.blog.models.BlogTranslation;
import modules.blog.models.IdPath;

import java.util.Date;
import java.util.List;

@Data
public class ResGetBlogById {
    private int id;
    private String title;
    private String shortDescription;
    private String description;
    private Date createdDate;
    private List<IdPath> images;
    private List<BlogTranslation> translations;

    public ResGetBlogById() {
    }
}
