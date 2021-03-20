package modules.blog.models;

import lombok.Data;

import java.util.Date;

@Data
public class BlogList {
    private int id;
    private String imagePath;
    private String title;
    private String shortDescription;
    private Date createdDate;

    public BlogList() {
    }
}
