package modules.blog.models.request;

import lombok.Data;

import java.util.Date;

@Data
public class ReqGetBlogList {
    private int pageNumber;
    private int pageSize;
    private String text;
    private Date dateFrom;
    private Date dateTo;

    public ReqGetBlogList() {
    }
}
