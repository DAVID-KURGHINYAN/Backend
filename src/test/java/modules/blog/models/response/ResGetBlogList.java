package modules.blog.models.response;

import lombok.Data;
import modules.blog.models.BlogList;

import java.util.List;

@Data
public class ResGetBlogList {
    private int pageCount;
    private int totalCount;
    private List<BlogList> list;

    public ResGetBlogList() {
    }
}
